package kh.mart.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import common.JDBCTemplate;
import kh.mart.model.vo.Customer;
import kh.mart.model.vo.Product;
import kh.mart.model.vo.order_Cart;

public class MartDao {
    int sum=0;
	
	Scanner sc=new Scanner(System.in);
	
	
	public int insertProduct(Connection conn, String name, String id, int sum)
	{
		
		String query="Insert into order_cart values(increaseNumber.nextVal,?,?,sysdate,?)";
		int result=0;
		PreparedStatement pstmt=null;
		try {
			pstmt=conn.prepareStatement(query);
			pstmt.setString(1,name );
			pstmt.setString(2,id);
			pstmt.setInt(3, sum);
			result=pstmt.executeUpdate();
			if(result>0) {
				conn.commit();
			}else {
				conn.rollback();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(pstmt);
		}
		return result;
	}
	
	
	
	//포인트 올려주기
	public int point(Connection conn, int sum,String id) {
		
		String query="Update Customer set c_point=c_point+? where c_id=?  ";
		
		int result=0;
		PreparedStatement pstmt=null;
		try {
			pstmt=conn.prepareStatement(query);
			pstmt.setDouble(1,(sum*0.2));
			pstmt.setString(2, id);
			result=pstmt.executeUpdate();
			
			if(result>0) {
				conn.commit();
				//System.out.println("포인트 등록성공");
			}else {
				conn.rollback();
				//System.out.println("포인트 등록실패");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
			JDBCTemplate.close(pstmt);
		}
		return sum;
	}
	
	
	public int insertMember(Connection conn, String id,String passwd, String phone, String address) {
		
		String query="Insert into Customer values(increaseNumber.nextVal,?,?,?,?,?,?) ";
		
		ArrayList<Customer> list=new ArrayList<Customer>();
		
		int result=0;
		PreparedStatement pstmt=null;
		
		try {
			pstmt=conn.prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.setString(2, passwd);
			pstmt.setString(3, phone);
			pstmt.setString(4, "브론즈");
			pstmt.setString(5, address);
			pstmt.setInt(6,0);
			
			result=pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
			JDBCTemplate.close(pstmt);
		}
		return result;
	}
	
	public ArrayList<order_Cart> orderHistory(Connection conn,String id){
	      
	      ArrayList<order_Cart> list=new ArrayList<order_Cart>();
	      
	      PreparedStatement pstmt=null;
	      ResultSet rset=null;
	      String query="select *from order_cart";
	      
	      try {
	         pstmt=conn.prepareStatement(query);
	        
	         rset=pstmt.executeQuery();
	         
	         while(rset.next()) {           
	            order_Cart c=new order_Cart();
	            c.setNum(rset.getInt("o_num"));
	            c.setName(rset.getString("o_name"));
	            c.setPerson(rset.getString("o_person"));
	            c.setDate(rset.getDate("o_date"));
	            c.setSum(rset.getInt("o_sum"));
	            list.add(c);           
	         }
	         
	      } catch (SQLException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }finally {
	            JDBCTemplate.close(pstmt);
	          JDBCTemplate.close(rset);
	            }
	            return list;    
	   }
	
	public int pointCheck(Connection conn,String id) {
		
		PreparedStatement pstmt=null;
		String query="select c_point from Customer where c_id=?";
		int result=0;
		ResultSet rset=null;
		try {
			Customer c=new Customer();
			pstmt=conn.prepareStatement(query);
			pstmt.setString(1, id);
			rset=pstmt.executeQuery();
			
			if(rset.next()) {
				c.setPoint(rset.getInt("c_point"));
				result=c.getPoint();
			}else {
				System.out.println("주문한 내역이 없습니다.");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(pstmt);
		}
		return result;
	}
	
	
	
	public int sum(Connection conn, String id) {
		PreparedStatement pstmt=null;
		ResultSet rset=null;
		String query="select o_sum from order_cart where o_person=?";
		order_Cart b;
		int result=0;
		int sum=0;
		try {
			b=new order_Cart();
			pstmt=conn.prepareStatement(query);
			pstmt.setString(1, id);
			rset=pstmt.executeQuery();
			
			while(rset.next()) {
				
				b.setSum(rset.getInt("o_sum"));
				sum+=b.getSum();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(pstmt);
		}
		
		return sum;
	}
	
	public int UpdateStock(Connection conn, int n, int amount) {
		
		PreparedStatement pstmt=null;
		Product p=null;
		String query="UPDATE PRODUCT SET p_stock=p_stock-? where p_num=?";
		int result=0;
		try {
			pstmt = conn.prepareStatement(query);
			 pstmt.setInt(1, amount);
			 pstmt.setInt(2, n);
			 result=pstmt.executeUpdate();
				
				if(result>0) {
					conn.commit();
					//System.out.println("포인트 등록성공");
				}else {
					conn.rollback();
					//System.out.println("포인트 등록실패");
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(pstmt);
		}
       
		return result;
	}
	
		//상품번호로 상품이름 가져오기
	   public String getName(Connection conn, int num) {

	      PreparedStatement pstmt = null;
	      ResultSet rset = null;
	      Product p;
	      
	      String query = "select p_name from product where p_num = ?";
	      String name = "";
	      try {
	    	  p = new Product();
	         pstmt = conn.prepareStatement(query);
	         pstmt.setInt(1, num);
	         System.out.println("num : "+num);
	         rset = pstmt.executeQuery();
	         if(rset.next()){
	            p.setName(rset.getString("p_name"));
	            name = p.getName();
	  
	         }else {
	        	 System.out.println("getName 실패!");
	         }

	   
	      } catch (SQLException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }
	      return name;
	   }
	   
	   //총액구하기
	public int sumPrice(Connection conn, int n, int amount,String id) {
	      PreparedStatement pstmt = null;
	      ResultSet rset = null;
	      Product p = null;
	      ArrayList<Product> list = new ArrayList<Product>();
	      String query = "select p_price from product where p_num = ? ";
	      int result=0;
	      int stock=0;
	      int price=0;
	      try {
	    	  sum=0;
	    	  p=new Product();
	         pstmt = conn.prepareStatement(query);
	         pstmt.setInt(1, n);
	         rset = pstmt.executeQuery();
	         if(rset.next()) {
	        	    p.setPrice(rset.getInt("p_price"));
	   	         price=p.getPrice();
	   	         sum+=amount*price;
	   	         result=point(conn,sum,id);
	   	         stock=UpdateStock(conn,n,amount);
	   	      //System.out.println(sum);
	         }else {
	        	
	         }
	         
	     
	      
	      } catch (SQLException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      } finally {
	
	         JDBCTemplate.close(pstmt);
	      }

	      return result;
	   }
	
	
	   public ArrayList<Product> orderPage(Connection conn) {
		      PreparedStatement pstmt = null;
		      ResultSet rset = null;
		      Product p = null;
		      ArrayList<Product> list = new ArrayList<Product>();
		      String query = "select * from product";
		      
		      try {
		         pstmt = conn.prepareStatement(query);
		         rset = pstmt.executeQuery();
		         while(rset.next()) {
		            p = new Product();
		            p.setNum(rset.getInt("p_num"));
		            p.setName(rset.getString("p_name"));
		            p.setPrice(rset.getInt("p_price"));
		            p.setStock(rset.getInt("p_stock"));
		            list.add(p);
		         }
		      } catch (SQLException e) {
		         // TODO Auto-generated catch block
		         e.printStackTrace();
		      }finally {
		         JDBCTemplate.close(rset);
		         JDBCTemplate.close(pstmt);
		      }
		      return list;
	   }
	   
	public int login(Connection conn, String id, String pw) {
		int result = 0;
		PreparedStatement pstmt = null;
		String query = "select *from Customer where c_id=? AND c_passwd=?";
		Customer c = null;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}		
		return result;
	}
}

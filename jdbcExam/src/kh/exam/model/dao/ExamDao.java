package kh.exam.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import common.JDBCTemplate;
import kh.exam.controller.ExamController;
import kh.exam.model.vo.Board;
import kh.exam.model.vo.Member;

public class ExamDao {
	Scanner scanner=new Scanner(System.in);
	public int postBoard(Connection conn, String title, String context, String id) {
		
		String query1="Insert into EXAM_BOARD values (boardNum.nextval,?,?,?,0,SYSDATE)";
		ArrayList<Member> list=new ArrayList<Member>();
	
		
		int result=0;
		PreparedStatement pstmt=null;
		
		try {
			pstmt=conn.prepareStatement(query1);
			pstmt.setString(1, title);
			pstmt.setString(2, context);
			pstmt.setString(3, id);
			System.out.println(id);
			 result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			
			JDBCTemplate.close(pstmt);
		}
		return result;
		
	}
	
	public ArrayList<Board> showBoard(Connection conn) {
		
		ArrayList<Board> list=new ArrayList<Board>();
		
		  PreparedStatement pstmt = null;
	      ResultSet rset = null;
	      String query = "select * from EXAM_BOARD";

	      try {
			pstmt = conn.prepareStatement(query);
			rset = pstmt.executeQuery();
			 while (rset.next()) {
				 	
			      Board b=new Board();
		          b.setBoardNo(rset.getInt("BOARD_NO"));
		          b.setBoardTitle(rset.getString("BOARD_TTTLE"));
		          b.setBoardContent(rset.getString("BOARD_CONTENT"));
		          b.setBoardWriter(rset.getString("BOARD_WRITER"));
		          b.setReadCount(rset.getInt("READ_COUNT"));
		          b.setWrite_Date(rset.getDate("WRITE_DATA"));
		          list.add(b);
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
	public int insertMember(Connection conn, Member m) {
		
		String query1="Insert into EXAM_MEMBER values (EX_SEQ.nextval,?,?,?,?)";
		ArrayList<Member> list=new ArrayList<Member>();
		System.out.println(m);
		int result=0;
		PreparedStatement pstmt=null;
		
		try {

			pstmt=conn.prepareStatement(query1);
			pstmt.setString(1,m.getMemberId());
			pstmt.setString(2, m.getMemberPw());;
			pstmt.setString(3, m.getMemberName());
			pstmt.setString(4, m.getPhone());
			
			result=pstmt.executeUpdate();
			
			if(result>0) {
				conn.commit();
			}else {
				conn.rollback();
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
	
			JDBCTemplate.close(pstmt);
		}
		return result;
	}
	public int updateMyInfo(Connection conn, String pw, String phone) {
		
		PreparedStatement pstmt=null;
		
		   String query="update exam_member set member_pw = ?,phone=?";  //?는 위치홀더
		   int result=0;
		   
		   try {
			pstmt=conn.prepareStatement(query);
			pstmt.setString(1, pw);
			pstmt.setString(2, phone);
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
	public int Login(Connection conn, String id, String pw) {
		
		int result=0;
		String query="select *from EXAM_MEMBER where MEMBER_ID=? AND MEMBER_PW=?";
		  PreparedStatement pstmt=null;
			try {
				conn=DriverManager.getConnection("jdbc:oracle:thin:@192.168.10.18:1521:xe","jdbc","1234");
				pstmt=conn.prepareStatement(query);
				pstmt.setString(1, id);
				pstmt.setString(2,pw);
				
				result=pstmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				
				JDBCTemplate.close(pstmt);
			}
			return result;
		
		
	}
	public ArrayList<Member> MyInfo(Connection conn, String id){
		ArrayList<Member> list=new ArrayList<Member>();
		 ResultSet rset = null;
		PreparedStatement pstmt=null;
		int result=0;
		  String query="select *from exam_member where member_id=?";
	
		  try {
			pstmt=conn.prepareStatement(query);
			  pstmt.setString(1, id);
			  rset=pstmt.executeQuery();
			  Member m;
				while(rset.next()) {
					m=new Member();
				    m.setMemberNo(rset.getInt("member_no"));
		            m.setMemberId(rset.getString("member_id"));
		            m.setMemberName(rset.getString("member_name"));
		            m.setMemberPw(rset.getString("member_pw"));
		            m.setPhone(rset.getString("phone"));
		           list.add(m);
				}
			  
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(pstmt);
		}
	return list;
	}
	
	public int deleteBoard(Connection conn, int num) {
		
		PreparedStatement pstmt=null;
		int result=0;
		  String query="delete from exam_board where board_no=?";
			try {
				pstmt=conn.prepareStatement(query);
				pstmt.setInt(1, num);
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
	public int deleteMyBoard(Connection conn, String id) {
		PreparedStatement pstmt=null;
		
		   String query="delete from exam_board where board_writer=?";  //?는 위치홀더
		   int result=0;
		   try {
			pstmt=conn.prepareStatement(query);
			pstmt.setString(1, id);
			result=pstmt.executeUpdate();
			if(result>0) {
				conn.commit();
				System.out.println("내가 쓴글역시 삭제");
				deleteMyInfo(conn, id);
			}else {
				conn.rollback();
				System.out.println("내가쓴글 삭제실패");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(pstmt);
		}
		   return result;
		   
	}
	
	public int deleteMyInfo(Connection conn,String id) {
		
		PreparedStatement pstmt=null;
		
		   String query="delete from exam_member where member_id=?";  //?는 위치홀더
		   int result=0;
		   try {
			pstmt=conn.prepareStatement(query);
			pstmt.setString(1, id);
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
	public int updateBoard(Connection conn,String title,String content) {
		
		PreparedStatement pstmt=null;
		
		   String query="update exam_board set board_tttle = ?, board_content=?";  //?는 위치홀더
		   int result=0;
		   try {
			pstmt=conn.prepareStatement(query);
			 pstmt.setString(1, title);
			   pstmt.setString(2, content);
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
	
	public ArrayList<Board> checkMember(Connection conn, String id,int num) {
		
		   ResultSet rset = null;
		   PreparedStatement pstmt=null;
		
		   String query1="select * from exam_board where board_writer=? AND board_no=?";
			  ArrayList<Board> list = new ArrayList<Board>();
		
		   try {
			pstmt=conn.prepareStatement(query1);
			   pstmt.setString(1,id);
			   pstmt.setInt(2, num);
			   rset=pstmt.executeQuery();
			   
			   while (rset.next()) {
		           
		            Board b=new Board();
			          b.setBoardNo(rset.getInt("BOARD_NO"));
			          b.setBoardTitle(rset.getString("BOARD_TTTLE"));
			          b.setBoardContent(rset.getString("BOARD_CONTENT"));
			          b.setBoardWriter(rset.getString("BOARD_WRITER"));
			          b.setReadCount(rset.getInt("READ_COUNT"));
			          b.setWrite_Date(rset.getDate("WRITE_DATA"));
			          list.add(b);
			        
		          
		         }
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			JDBCTemplate.close(pstmt);
		}
		
		 return list;
	}
	
	public void readCount(Connection conn, int num) {
		String query="update exam_board set read_count=read_count+1 where board_no=? ";
		
		 PreparedStatement pstmt=null;
		 int result=0;
		 try {
			pstmt=conn.prepareStatement(query);
			pstmt.setInt(1, num);
			result=pstmt.executeUpdate();
			if(result>0) {
				conn.commit();
				System.out.println("조회수증가");
			}else {
				conn.close();
				System.out.println("조회 수증가실패");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(pstmt);
		}
	}
	public ArrayList <Board> showDetail(Connection conn, int num){
		
		ArrayList<Board> list=new ArrayList<Board>();
		 PreparedStatement pstmt=null;
		 ResultSet rset=null;
		 String query="select *from EXAM_BOARD where BOARD_NO= ?";
		 
		 try {
			 pstmt=conn.prepareStatement(query);
			pstmt.setInt(1, num);
			rset=pstmt.executeQuery();
			Board b=null;
			while(rset.next()) {
				b=new Board();
				b.setBoardNo(rset.getInt("BOARD_NO"));
				b.setBoardTitle(rset.getString("BOARD_TTTLE"));
				b.setBoardContent(rset.getString("BOARD_CONTENT"));
				b.setBoardWriter(rset.getString("BOARD_WRITER"));
				b.setReadCount(rset.getInt("READ_COUNT"));
				b.setWrite_Date(rset.getDate("WRITE_DATA"));
	           list.add(b);
			}
			readCount(conn,num);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		return list;
	}
	public String findId(Connection conn, String name, String phone){
		
		  ArrayList<Member> list=new ArrayList<Member>();
		  
		  PreparedStatement pstmt=null;
		   ResultSet rset=null;
		   String query="select *from EXAM_MEMBER where MEMBER_NAME = ? AND PHONE= ?";
		   String id=null;
		   try {
			conn=DriverManager.getConnection("jdbc:oracle:thin:@192.168.10.18:1521:xe","jdbc","1234");
			pstmt=conn.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setString(2, phone);

			rset=pstmt.executeQuery();
			Member m=null;
			while(rset.next()) {
				m=new Member();
			    m.setMemberNo(rset.getInt("member_no"));
	            m.setMemberId(rset.getString("member_id"));
	            m.setMemberName(rset.getString("member_name"));
	            m.setMemberPw(rset.getString("member_pw"));
	            m.setPhone(rset.getString("phone"));
	           
			}
			if(m!=null) {
				id=m.getMemberId();
			}else {
				id="nobody";
			}
	
	
		   } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
			if(id==null) {
				return "nobody";
			}else {
				   return id;	
			}
		
	}

}

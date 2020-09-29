package kh.mart.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import common.JDBCTemplate;
import kh.mart.model.dao.MartDao;
import kh.mart.model.vo.Customer;
import kh.mart.model.vo.Product;
import kh.mart.model.vo.order_Cart;

public class MartController {
	Scanner sc;
	MartDao dao;
	Customer c;
		public MartController() {
			sc=new Scanner(System.in);
			dao=new MartDao();
		}
	public void main() {
	     
	      
	      System.out.println("==== KH MART ===");
	      System.out.println("1. 로그인 하기 ");
	      System.out.println("2. 회원가입");
	      System.out.println("0. 종료");
	      System.out.print("선택 > ");
	      int sel = sc.nextInt();
	      switch(sel) {
	      case 1 :
	        login();
	         break;
	      case 2: 
	         insertMember();
	         break;
	      case 0:
	         System.out.println("프로그램을 종료합니다.");
	         break;      
	      }
}
	
	
	public void orderMain(String id) {
	      System.out.println(" ------ 주문 페이지 ----- ");
	      System.out.println("1.주문하기");
	      System.out.println("2.주문내역");
	      System.out.println("3.계산");
	      System.out.println("4.로그아웃");
	      System.out.print("선택 > ");
	      int sel = sc.nextInt();
	      
	      switch(sel) {
	      case 1:
	         orderPage(id);
	         break;
	      case 2:
	         orderHistory(id);
	         break;
	      case 3:
	         pay(id);
	         break;
	      case 4:
	         logout();
	         break;
	      }
	   }
	public void orderPage(String id) {
	      Connection conn = JDBCTemplate.getConnection();
	      System.out.println("----- 주문하기 -----");

	      ArrayList<Product> list = dao.orderPage(conn);
	      System.out.println("제품번호\t제품이름\t제품가격\t재고");
	      if (list.isEmpty()) {
	         System.out.println("조회할 제품이 없습니다.");
	      } else {
	         for (Product p : list) {
	            System.out.println(p.getNum() + "\t" + p.getName() + "\t" + p.getPrice() + "\t" + p.getStock());

	         }
	      }

	      int sum=0;
	      int n=0;
	      int amount=0;
	      int result1=0;
	      String productName="";
	      boolean bool=true;
	      int result=0;
	      while(bool) {
	    	  
	    	  System.out.print("주문할 제품 번호 입력 (주문 끝나면 0입력) : ");
	    	   n=sc.nextInt();
	    	  if(n==0) {
	    		  System.out.println("주문종료.");
	    		 orderMain(id);
	    		 break;
	    	  }
	    	  System.out.print("구매하고자 하는 수량 입력 : ");
	    	   amount=sc.nextInt();
	 	      sum=dao.sumPrice(conn,n,amount,id);	  
	 	    // result=dao.point(conn,sum,id);
	 	     productName = dao.getName(conn,n);
	       result1= dao.insertProduct(conn, productName, id, sum);
	      }
	      
	   }

	

	public void pay(String id) {
		Connection conn=JDBCTemplate.getConnection();
		
		int sum=dao.sum(conn,id);
		int pointCheck=dao.pointCheck(conn, id);
		System.out.println("주문한 내역 총 금액은 "+sum+"입니다.");
		System.out.println("현재 가지고 있는 포인트는 "+pointCheck);
		int point=0;
		int stock=0;
	
		int result=0;
		result=dao.pointCheck(conn,id);
		
		
		if(result>sum) {
			System.out.println("포인트 사용하시겠습니까?");
		}else {
			System.out.println("포인트가 부족합니다.");
			System.out.println("현금이나 카드 이용해주세요.");
		}
		orderMain(id);
	}
	
	
	  public void orderHistory(String id) {
			Connection conn = JDBCTemplate.getConnection();
			order_Cart oc = new order_Cart();
			System.out.println(" ===== 주문 내역 보기 ===== ");	
			ArrayList<order_Cart> list = dao.orderHistory(conn,id); 
			
			if(list.isEmpty()) {
				System.out.println("주문내역이 없습니다.");
			}else {
				
				System.out.println("상품번호\t 상품명\t 주문자 \t\t 주문 날짜\t 총액");
				for(order_Cart o : list) {
					System.out.println(o.getNum()+"\t"+o.getName()+"\t"+o.getPerson()+"\t"+o.getDate()+"\t"+o.getSum());		
				}	
				System.out.println("메뉴로 돌아가려면 0입력");
				int n=sc.nextInt();
				if(n==0) {
					orderMain(id);
				}
			}
			JDBCTemplate.close(conn);
		}
	   

	
	
	public void logout() {
		System.out.println("로그아웃 되었습니다.");
		main();
	}
	public void insertMember() {
		Connection conn=JDBCTemplate.getConnection();
		System.out.print("아이디를 입력해주세요 : ");
		String id=sc.next();
		System.out.print("비밀번호를 입력해주세요: ");
		String passwd=sc.next();
		System.out.print("휴대폰번호를 - 제외하고 입력해주세요 : ");
		String phone=sc.next();
		System.out.print("주소를 입력해주세요 : ");
		String address=sc.next();
		
		int result=dao.insertMember(conn, id,passwd,phone, address);
		
		if(result>0) {
			try {
				conn.commit();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("회원등록 성공");
			main();
		}else {
			try {
				conn.rollback();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("회원등록 실패");
		}
	}
	
	public void login() {
		Connection conn = JDBCTemplate.getConnection();
	      c = new Customer();
	      while(true) {
	         System.out.println("---- 로그인 ----");
	         System.out.print("아이디 입력 : ");
	         String id = sc.next();      
	         c.setId(id);
	         System.out.print("비밀번호 입력 : ");
	         String pw = sc.next();
	         c.setPw(pw);
	         int result = dao.login(conn,id,pw);
	         if (result >0) {
	            System.out.println("로그인 완료");
	            orderMain(id);
	         }else {
	            System.out.println("로그인 실패");
	            main();
	         }
	         JDBCTemplate.close(conn);
	         }
	      
			
		
	}
}
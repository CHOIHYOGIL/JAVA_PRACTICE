package kh.exam.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import common.JDBCTemplate;
import kh.exam.model.dao.ExamDao;
import kh.exam.model.vo.Board;
import kh.exam.model.vo.Member;

public class ExamController {
	static Scanner scanner;
	Member loginMember;
	static ExamDao dao;
	static boolean bool=true;
	public ExamController() {
		scanner=new Scanner(System.in);
		dao=new ExamDao();
	}
	public static void main1(String id) {
		
	while(true) {
			
			System.out.println("=====KH 커뮤니티=====");
			System.out.println("1. 게시물 목록 보기");
			System.out.println("2. 게시물 상세보기");
			System.out.println("3. 게시물 등록");
			System.out.println("4. 게시물 수정");
			System.out.println("5. 게시물 삭제");
			System.out.println("6. 내정보 보기");
			System.out.println("7. 내 정보 변경");
			System.out.println("8. 회원 탈퇴");
			System.out.println("0. 로그아웃");
			System.out.print("선택 > ");
			int choice=scanner.nextInt();
			switch(choice) {
			
			case 1: 
				showBoard();
				break;
			case 2:
				showDetail();
				break;
			case 3:
				Post(id);
				break;
			case 4:
				Update(id);
				break;
			case 5:
				Delete(id);
				break;
			case 6:
				MyInfo(id);
				break;
			case 7:
				UpdateMyInfo(id);
				break;
			case 8:
				DeleteMyInfo(id);
				break;
			case 0:
				Logout();
				break;
				
			
			}
		}
		
	}
	
	public static void Logout() {
		
		main();
	}
	public static void 	DeleteMyInfo(String id) {
		Connection conn=JDBCTemplate.getConnection();
		
		System.out.println("====회원 탈퇴 ====");
		System.out.print("정말 탈퇴하시겠습니까?(1.YES / 2. NO)?");
		int answ=scanner.nextInt();
		int result=0;
		if(answ==1) {
		  result=dao.deleteMyBoard(conn,id);
		  
		  if(result>0) {
			  System.out.println("삭제완료");
		  }else {
			  System.out.println("삭제 실패");
		  }
		}else {
			System.out.println("취소하셨습니다.");
			main1(id);
		}
	}
	public static void UpdateMyInfo(String id) {
		Connection conn=JDBCTemplate.getConnection();
		
		System.out.println("=== 내정보 수정 ===");
		System.out.print("PW 입력 : ");
		String pw=scanner.next();
		System.out.print("전화번호 입력(ex.01011112222) : ");
		String phone=scanner.next();
		
		int result=dao.updateMyInfo(conn,pw,phone);
		
		if(result>0) {
			
			System.out.println("내 정보 수정완료!");
		}else {
			
			System.out.println("내 정보 수정실패!");
		}
	}
	public static void MyInfo(String id) {
		
		Connection conn=JDBCTemplate.getConnection();
		ArrayList<Member> list=dao.MyInfo(conn, id);
		  if (list.isEmpty()) {
		         System.out.println("내정보 오류");
		      } else {
		    	  System.out.println("===내정보 보기===");
			         
			         for (Member m : list) {
			            System.out.println("회원번호 : "+
			               m.getMemberNo()+"\n아이디 :"+m.getMemberId()+"\n비밀번호 : "+m.getMemberPw()+"\n이름 : "
			               +m.getMemberName()+"\n전화번호 : "+m.getPhone()+"\n");
			         }
		      }
		
	}
	public static void Delete(String id ) {
		Connection conn=JDBCTemplate.getConnection();
		System.out.print("게시물 번호 입력 : ");
		int num=scanner.nextInt();
		int result=0;
		ArrayList<Board> list=dao.checkMember(conn, id,num);
		  if (list.isEmpty()) {
		         System.out.println("작성자만 삭제가능합니다.");
		      } else {
		   
		
		    	  result=dao.deleteBoard(conn,num);
		    	  
		    	  if(result>0) {
		    		
		    		  System.out.println("게시글 삭제 완료!");
		    	  }else {
		    		  System.out.println("게시글 삭제 실패!");
		    	  }
		      }

	}
	public static void Update(String id){
		Connection conn=JDBCTemplate.getConnection();
		System.out.print("게시물 번호 입력 : ");
		int num=scanner.nextInt();
		Board b=new Board();
		int result=0;
		System.out.println(id);
		ArrayList<Board> list=dao.checkMember(conn, id,num);
		  if (list.isEmpty()) {
		         System.out.println("작성자만 수정가능합니다.");
		      } else {
		    	  System.out.print("제목 입력:");
		    	  String title=scanner.next();
		    	  System.out.print("내용 입력: ");
		    	  String content=scanner.next();
		    	  
		    	
		    	  result=dao.updateBoard(conn,title,content);
		    	  if(result>0) {
		    		
		    		  System.out.println("수정완료!");
		    	  }else {
		    		  System.out.println("수정실패!");
		    	  }
		      }
		
		
		
	
	}
	
	public static void showDetail() {
		
		Connection conn=JDBCTemplate.getConnection();
		
		System.out.print("게시물 번호 입력 : ");
		int num=scanner.nextInt();
		
		ArrayList <Board> list=dao.showDetail(conn, num);
		 if (list.isEmpty()) {
	         System.out.println("게시글이 없습니다.");
	      } else {
	         System.out.println("===게시글 정보===");
	         
	         for (Board b : list) {
	            System.out.println("게시물 번호 : "+
	               b.getBoardNo()+"\n게시물 제목 :"+b.getBoardTitle()+"\n게시물 내용 : "+b.getBoardContent()+"\n게시물 작성자 : "
	               +b.getBoardWriter()+"\n게시물 조회 수 : "+b.getReadCount()+"\n게시물 작성일 : "+b.getWrite_Date());
	         }
	      }
			
	}
	public static void showBoard() {
		Connection conn=JDBCTemplate.getConnection();
		ArrayList<Board> list=dao.showBoard(conn);
		
		 if (list.isEmpty()) {
	         System.out.println("게시글이 없습니다.");
	      } else {
	         System.out.println("===전체 게시글 출력===");
	         System.out.println("번호\t제목\t내용\t글쓴이\t조회횟수\t작성일\t");
	         for (Board b : list) {
	            System.out.println(
	               b.getBoardNo()+"\t"+b.getBoardTitle()+"\t"+b.getBoardContent()+"\t"
	               +b.getBoardWriter()+"\t"+b.getReadCount()+"\t"+b.getWrite_Date()+"\t");
	         }
	      }
		
		 
	}
	public static void Post(String id) {
		Connection conn=JDBCTemplate.getConnection();
		System.out.print("제목 입력 : ");
		String title=scanner.next();
		System.out.print("내용 입력 : ");
		String context=scanner.next();

		int result=dao.postBoard(conn,title,context,id);
				
		if(result>0) {
			try {
				conn.commit();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("게시글 등록성공");
		}else {
			try {
				conn.rollback();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("게시글 등록 실패");
		}
	
	}
	public static void main() {
		
		while(bool) {
			
			System.out.println("=====KH 커뮤니티=====");
			System.out.println("1. 로그인하기");
			System.out.println("2. 회원가입");
			System.out.println("3. 아이디 찾기");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 > ");
			int choice=scanner.nextInt();
			switch(choice) {
			
			case 1: 
				Login();
				break;
			case 2:
				Join();
				break;
			case 3:
				findId();
				break;
			case 0:
				bool=finish();
				break;
			}
		}
	}
	public static boolean  finish() {
	
		System.out.println("프로그램 종료");
		return false;
	}
	public static void findId() {
		Connection conn=JDBCTemplate.getConnection();
		System.out.println("=== 아이디 찾기 ===");
		System.out.print("이름 입력 : ");
		String name=scanner.next();
		System.out.print("전화번호 입력 : ");
		String phone=scanner.next();
		
		String id=dao.findId(conn,name,phone);
		 if (id.equals("nobody")) {
	         System.out.println("일치하는 회원이 없습니다.");
	      } else {
	    	 
	    	  System.out.println("아이디는 ["+id+"] 입니다.");
	            
	       
	      }
		
	}
	public static void Login() {
		Connection conn=JDBCTemplate.getConnection();
		System.out.println("=======로그인=========");
		System.out.print("ID 입력 : ");
		String id=scanner.next();
		System.out.print("PW 입력 : ");
		String pw=scanner.next();
		int result=dao.Login(conn,id,pw);
		
		if(result>0) {
			System.out.println("로그인 완료");
			main1(id);
		}else {
			System.out.println("로그인 실패");
		}
		
		
	}
	
	public static void Join() {
		Member m=new Member();
		System.out.println("==== 회원가입 ====");
		System.out.print("ID 입력 : ");
		String id=scanner.next();
		Connection conn=JDBCTemplate.getConnection();
		m.setMemberId(id);
		System.out.print("PW 입력: ");
		String Pw=scanner.next();
		m.setMemberPw(Pw);
		System.out.print("이름 입력 : ");
		String name=scanner.next();
		m.setMemberName(name);
		System.out.print("전화번호 입력(ex.01011112222) : ");
		String phone=scanner.next();
		m.setPhone(phone);
		

		
		int result=dao.insertMember(conn,m);
		
		if(result>0) {
	
			System.out.println("회원가입 성공");
		}else {
		
			System.out.println("회원가입 실패");
		}
		
	}

}

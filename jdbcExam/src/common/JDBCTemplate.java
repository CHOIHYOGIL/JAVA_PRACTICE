package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import kh.exam.model.vo.Member;

public class JDBCTemplate {

	//데이터베이스 코드 중 중복부분 처리
	//1. Driver 등록, Connection 객체 생성
	//2. Connection Close
	//3. commit, rollback
	
	public static Connection getConnection() {
		
	    Connection conn = null;
	    
	      try {
	         Class.forName("oracle.jdbc.driver.OracleDriver");
				conn=DriverManager.getConnection("jdbc:oracle:thin:@192.168.10.18:1521:xe","jdbc","1234");
				conn.setAutoCommit(false);  //자동으로 커밋되는 설정해제
		
	}catch (ClassNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
     } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
     } 
	return conn;
	
}
	
	public static void close(Connection conn) {
		try {
			if(conn!=null && !conn.isClosed())            //보통 close는 finally에서 하는데, finally는 오류가 나더라도 실행하므로, 오류 방지하기 위해 conn이 null이 아니거나 이미 닫혀있지 않은 상태면 실행되도록!
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public  static void close(Statement stmt) {     //오버로딩
		
		try {
		
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void close(ResultSet set) {
		
		try {
			if(set!=null && !set.isClosed())
				set.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void commit(Connection conn) {
		
		try {
			if(conn!=null && !conn.isClosed())   
			conn.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void Rollback(Connection conn) {
		
		try {
			if(conn!=null && !conn.isClosed()) 
			conn.rollback();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

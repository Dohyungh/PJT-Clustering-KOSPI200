package com.ssafy.board.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ssafy.board.model.dto.stock;

// java.lang.Class 가 자동 임포트
public class JdbcTest {
	
	//1. JDBC 드라이버 로드
	public JdbcTest() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 로딩 성공!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		JdbcTest db = new JdbcTest();
		
		for (stock board : db.selectAll()) {
			System.out.println(board);
			
		}
		
		
	}
	// 전체 게시글을 가져오는 메서드
	private List<stock> selectAll() {
		List<stock> list = new ArrayList<>();
		
		// 2. 데이터베이스를 연결해야 됨.
		
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssafy_board?serverTimezone=UTC", "ssafy", "ssafy");
			
			//3. SQL 실행
			Statement stmt = conn.createStatement();
			String sql = "SELECT * FROM board";
			
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				stock stock = new stock(); // 바구니 빈 게시글 준비
//				board.setId(rs.getInt(1)); // 인덱스 1 부터 시작
				// 두개는 동일한 말이다
				
				
				list.add(stock);
				
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

}

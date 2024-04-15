package com.ssafy.board.model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.ssafy.board.util.DBUtil;

//싱글턴으로 관리할 것
public class BoardDaoImpl implements BoardDao {
	//DB 관련 파일 가져오기
	private final DBUtil dbUtil = DBUtil.getInstance();
	
	private static BoardDao instance = new BoardDaoImpl();
	private BoardDaoImpl() {
		
	}
	public static BoardDao getInstance() {
		return instance;
	}
	
	static int cnt = 0;
	
	@Override
	public void addColumn() {
		cnt++;
		String sql = "ALTER TABLE price ADD COLUMN `"+cnt+"` INT;";
		
		// 2. 데이터베이스를 연결해야 됨.
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = dbUtil.getConnection();
			stmt = conn.createStatement();
			stmt.execute(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbUtil.close(rs,stmt,conn);
		}
		
	}
	
	
	//INSERT INTO price (id,`1`,`2`,`3`,`4`)
	//VALUES (005930,82900,84800,85400,86000);
	public void addRow(List<String> row) {
		String sql = "INSERT INTO price (id"; // 738번 반복
		
		for (int i = 1; i <=738; i++) {
			sql+=",`"+i+"`";
		}
		
		sql += ") VALUES ('";
		sql += row.get(0) +"'";
		
		for (int i = 1; i <739; i++) {
			sql+=","+row.get(i);
		}
		
		sql+= ");";
		
//		System.out.println(sql);
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = dbUtil.getConnection();
			stmt = conn.createStatement();
			stmt.execute(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbUtil.close(rs,stmt,conn);
		}
	}
}

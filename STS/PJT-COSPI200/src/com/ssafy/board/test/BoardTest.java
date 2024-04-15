package com.ssafy.board.test;

import java.util.List;

import com.ssafy.board.model.dao.BoardDao;
import com.ssafy.board.model.dao.BoardDaoImpl;
import com.ssafy.board.model.dao.CSVReader;



//싱글턴으로 관리할 것
public class BoardTest {
	
	public static void main(String[] args) {
		BoardDao dao = BoardDaoImpl.getInstance();
		
		for (int i =0; i <738; i++) {
			dao.addColumn(); 
			if (i %100 == 0) System.out.println(i);
		}
		List<List<String>> data = CSVReader.getData();
		for (int i =0; i <200; i++) {
			dao.addRow(data.get(i)); 
			if (i %100 == 0) System.out.println(i);
		}
		
		System.out.println(data.get(0));
		
		

	}
	
	

}

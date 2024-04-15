package com.ssafy.board.model.dao;

import java.util.List;

public interface BoardDao {
	
	public void addColumn();

	public void addRow(List<String> row);

}

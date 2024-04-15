package com.ssafy.board.model.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class CSVReader {
	public static List<List<String>> data; 
	
	static {
		try {
			data = readCSV();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static List<List<String>> readCSV() throws IOException {
		data = new ArrayList<List<String>>();
		File csv = new File("C:\\Users\\SSAFY\\Desktop\\LUCAS\\Lucas-workspace-STS4\\PJT-COSPI200\\src\\price-2024.csv");
		BufferedReader br = new BufferedReader(new FileReader(csv));
		br.readLine();
		for (int i = 0; i < 200; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), ",");
			data.add(new ArrayList<String>());
			List<String> li = data.get(i);
			li.add(st.nextToken());
			while(st.hasMoreTokens()) {
				
				li.add(""+(int) Double.parseDouble(st.nextToken()));
				
			}
			
		}
		br.close();
		return data;
	}
	
	public static List<List<String>> getData() {
		return data;
	}

}

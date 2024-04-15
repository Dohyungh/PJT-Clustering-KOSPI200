package com.ssafy.board.model.dto;

import java.util.Arrays;

public class stock {
	private String code;
	private String name;
	private String descriptiveData;
	private int[] prices ;
	private double[] financialData;


	public stock(String code, String name, String descriptiveData, int[] prices, double[] financialData) {
		this.code = code;
		this.name = name;
		this.descriptiveData = descriptiveData;
		this.prices = prices;
		this.financialData = financialData;
	}

	@Override
	public String toString() {
		return "Board [code=" + code + ", name=" + name + ", descriptiveData=" + descriptiveData + ", prices="
				+ Arrays.toString(prices) + ", financialData=" + Arrays.toString(financialData) + "]";
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescriptiveData() {
		return descriptiveData;
	}

	public void setDescriptiveData(String descriptiveData) {
		this.descriptiveData = descriptiveData;
	}

	public int[] getPrices() {
		return prices;
	}

	public void setPrices(int[] prices) {
		this.prices = prices;
	}

	public double[] getFinancialData() {
		return financialData;
	}

	public void setFinancialData(double[] financialData) {
		this.financialData = financialData;
	}

	public stock() {
	}



}

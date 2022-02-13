package com.example.purchases.model;

import java.util.ArrayList;
import java.util.List;

public class CalcCartItem {
	private List<Product> listItem = new ArrayList<Product>();
	private float totalSumm;
	
	
	public CalcCartItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CalcCartItem(List<Product> listItem, float totalSumm) {
		super();
		this.listItem = listItem;
		this.totalSumm = totalSumm;
	}
	public List<Product> getListItem() {
		return listItem;
	}
	public void setListItem(List<Product> listItem) {
		this.listItem = listItem;
	}
	public float getTotalSumm() {
		return totalSumm;
	}
	public void setTotalSumm(float totalSumm) {
		this.totalSumm = totalSumm;
	}
	
	
}

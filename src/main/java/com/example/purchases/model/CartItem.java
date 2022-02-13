package com.example.purchases.model;

import java.util.ArrayList;
import java.util.List;


public class CartItem {
	private List<Product> listItem = new ArrayList<Product>();
	private int paymentType; 
	private int idAddress;
	
	public CartItem(List<Product> listItem, int paymentType, int idAddress) {
		super();
		this.listItem = listItem;
		this.paymentType = paymentType;
		this.idAddress = idAddress;
	}	
		
	public List<Product> getListItem() {
		return listItem;
	}

	public void setListItem(List<Product> listItem) {
		this.listItem = listItem;
	}

	public int getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(int paymentType) {
		this.paymentType = paymentType;
	}
	
	public int getIdAddress() {
		return idAddress;
	}
	public void setIdAddress(int idAddress) {
		this.idAddress = idAddress;
	}	

}

package com.example.purchases.model;

public class Product {
	private int id;
	private int quantity;
	private float summa;
	public Product(int id, int quantity, float summa) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.summa = summa;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getSumma() {
		return summa;
	}
	public void setSumma(float summa) {
		this.summa = summa;
	}

}

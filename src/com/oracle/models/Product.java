package com.oracle.models;

public class Product {

	// Fields

	private int itemId;
	private String name;
	private int qtyInStock;
	private double price;

	// constructor

	public Product() {

	}

	public Product(int itemId, String name, int qtyInStock, double price) {
		this.itemId = itemId;
		this.name = name;
		this.qtyInStock = qtyInStock;
		this.price = price;
	}

	// getter setter

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQtyInStock() {
		return qtyInStock;
	}

	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// public

	@Override
	public String toString() {
		return "\n\nItem number : " + this.itemId 
				+ "\nName : " + this.name 
				+ "\nQuantity in stock : " + this.qtyInStock
				+ "\nPrice:" + this.price;
	}

}

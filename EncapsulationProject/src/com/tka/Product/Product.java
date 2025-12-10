package com.tka.Product;

public class Product {
	private int p_id;
	private  String p_name;
	private String category;
	private int quantity;
	
	Product(int id,String n,String c,int q){
		this.p_id=id;
		this.p_name=n;
		this.category=c;
		this.quantity=q;
	}
	public int getPID() {
		return p_id;
	}
	public void setPID(int id) {
		this.p_id=id;
	}
	public String getPName() {
		return p_name;
	}
	public void setPName(String n) {
		this.p_name=n;
	}
	public String getCategory() {
		return category;
		
	}
	public void setCategory(String c) {
		this.category=c;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int q) {
		this.quantity=q;
	}
}

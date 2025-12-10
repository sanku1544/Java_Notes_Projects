package com.tka.Product;

public class Test {

	public static void main(String[] args) {
		Product p1=new Product(512,"Good Day","Food",15);
		int id=p1.getPID();
		System.out.println(id);
		p1.setPID(422);
		String name=p1.getPName();
		System.out.println(name);
		p1.setPName("Marigold");
		String category=p1.getCategory();
		System.out.println(category);
		p1.setCategory("Food");
		int q=p1.getQuantity();
		System.out.println(q);
		p1.setQuantity(35);
		System.out.println("---------------------Updated Values---------------------");
		int id1=p1.getPID();
		System.out.println(id1);;
		String name1=p1.getPName();
		System.out.println(name1);
		String category1=p1.getCategory();
		System.out.println(category1);
		int q1=p1.getQuantity();
		System.out.println(q1);
	}

}

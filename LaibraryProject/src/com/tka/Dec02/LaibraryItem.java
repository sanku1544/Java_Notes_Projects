package com.tka.Dec02;

public class LaibraryItem {
	 private String title;
	 private String author;
	 private String location;
	 
	 public String getTitle() {
		return title;
	}
	 public void setTitle(String title) {
		 this.title = title;
	 }
	 public String getAuthor() {
		 return author;
	 }
	 public void setAuthor(String author) {
		 this.author = author;
	 }
	 public String getLocation() {
		 return location;
	 }
	 public void setLocation(String location) {
		 this.location = location;
	 }
	 public LaibraryItem(String title, String author, String location) {
		super();
		this.title = title;
		this.author = author;
		this.location = location;
	 }
	void displayInfo() {
		System.out.println("Book Titile is: "+title);
		System.out.println("Book Author Name is: "+author);
		System.out.println("Book Location is: "+location);
	}
}

package com.tka.Dec02;

public class EBook extends LaibraryItem{
	String format;
	String fileSize;
	public EBook(String title, String author, String location,String format, String fileSize) {
		super( title,  author,  location);
		this.format = format;
		this.fileSize = fileSize;
	}
	void displayInfo() {
		System.out.println("Book Titile is: "+super.getTitle());
		System.out.println("Book Author Name is: "+super.getAuthor());
		System.out.println("Book Location is: "+super.getLocation());
		System.out.println("Book Format is: "+format);
		System.out.println("Book size is: "+fileSize);

	}
	
	
}

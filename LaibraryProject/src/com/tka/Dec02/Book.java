package com.tka.Dec02;

public class Book extends LaibraryItem {
	private String genre;
	private int numberOfPages;
	
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	public Book(String title, String author, String location,String genre,int n) {
		super( title,  author,  location);
		this.genre=genre;
		numberOfPages=n;
	}
	void displayInfo() {
		System.out.println("Book Titile is: "+super.getTitle());
		System.out.println("Book Author Name is: "+super.getAuthor());
		System.out.println("Book Location is: "+super.getLocation());
		System.out.println("Book genre is: "+genre);
		System.out.println("Number Of pages Of Book is: "+numberOfPages);

	}
}

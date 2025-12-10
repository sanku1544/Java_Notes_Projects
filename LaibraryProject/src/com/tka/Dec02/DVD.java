package com.tka.Dec02;

public class DVD extends LaibraryItem {
  String director;
  String runTime;
  public DVD(String title, String author, String location,String director, String runTime) {
	  super( title,  author,  location);
	this.director = director;
	this.runTime = runTime;
  }
  void displayInfo() {
	  System.out.println("Book Titile is: "+super.getTitle());
		System.out.println("Book Author Name is: "+super.getAuthor());
		System.out.println("Book Location is: "+super.getLocation());
		System.out.println("Book Director is: "+director);
		System.out.println("Book Runtime is: "+runTime);

	}
	
}

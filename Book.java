package com.dxc.logical;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Vector;

public class Book {
	int isbn;
	String title;
	String author;
	

	public Book(int isbn, String title, String author) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
	}


	public int getIsbn() {
		return isbn;
	}


	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}


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

	void disp() {
		System.out.println(isbn+" "+title+" "+author);
		
		
		
	}
	

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author + "]";
	}


	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book=new Book(9767736,"Java","Xyz");
		book.disp();
		

	}*/

}

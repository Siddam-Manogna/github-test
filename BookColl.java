package com.dxc.logical;

public class BookColl implements Comparable<Book>{

private int isbn;
private String title;
private String authorName;
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
public String getAuthorName() {
return authorName;
}
public void setAuthorName(String authorName) {
this.authorName = authorName;
}
public BookColl(int isbn, String title, String authorName) {
super();
this.isbn = isbn;
this.title = title;
this.authorName = authorName;
}
@Override
public String toString() {
return "Book [isbn=" + isbn + ", title=" + title + ", authorName=" + authorName + "]";
}

public BookColl(){}
@Override
public int compareTo(Book o) {
return o.isbn - this.isbn;  
}



}
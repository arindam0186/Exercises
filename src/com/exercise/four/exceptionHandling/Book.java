package com.exercise.four.exceptionHandling;

import com.exercise.four.exceptionHandling.exceptions.MyCustomException;
import com.practice.four.exceptionHandling.exceptions.RangeCheckException;

public class Book {

	private int bookId;
	private String bookName;
	private String author;
	private double price;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int bookId, String bookName, String author, double price)throws RangeCheckException {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) throws MyCustomException {
		try {
			this.bookName = bookName;
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			throw new MyCustomException("Book name cannot be null", e);
		}
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) throws RangeCheckException {
		if(price<0 || price>99999) {
			throw new RangeCheckException("Price not in range");
		}
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", price=" + price + "]";
	}
	
	
}

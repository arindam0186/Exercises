package com.exercise.four.exceptionHandling;

import com.exercise.four.exceptionHandling.exceptions.MyCustomException;
import com.practice.four.exceptionHandling.exceptions.RangeCheckException;

public class Application {

	public static void main(String[] args) throws MyCustomException, RangeCheckException {
		// TODO Auto-generated method stub

		BookService service = new BookService();
		
		
		Book englishBook = new Book(1,"ENGLISH BOOK","John",200.00);
		
		Book mathBook = new Book();
		mathBook.setBookId(2);
		mathBook.setBookName("MATHS BOOK");
		mathBook.setAuthor("Johnny");
		mathBook.setPrice(600);
		
		service.add(englishBook);
		service.add(mathBook);
		
		System.out.println(service.getOne(1));
		System.out.println(service.getOne(2));
		
		Book[] books = service.getAll();
		for(int i=0;i<2;i++) {
			System.out.println(books[i]);
		}
	}

}

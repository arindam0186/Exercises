package com.exercise.four.exceptionHandling;

import com.exercise.four.exceptionHandling.exceptions.MyCustomException;
import com.practice.four.exceptionHandling.exceptions.RangeCheckException;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BookService service = new BookService();
		
		
		Book englishBook = null;
		try {
			englishBook = new Book(1,"ENGLISH BOOK","John",200.00);
		} catch (RangeCheckException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		
		Book mathBook = new Book();
		mathBook.setBookId(2);
		try {
			mathBook.setBookName(null);
		} catch (MyCustomException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
//			e.printStackTrace();
		}
		mathBook.setAuthor("Johnny");
		try {
			mathBook.setPrice(600);
		} catch (RangeCheckException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
//			e.printStackTrace();
		}
		
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

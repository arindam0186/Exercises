package com.practice.five.serialization;

import java.io.File;

import com.practice.five.serialization.services.BookService;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BookService service = new BookService();
		
		Book book = new Book(007,"Bond","James",300.00);
		
//		boolean result = service.writeObject(book);
//		
//		if(result) {
//			System.out.println("Book persisted");
//		}
//		else {
//			System.out.println("Error - Check");
//		}
//		
//		Book newBook = service.readObject();
//		
//		System.out.println("Deserialized book ==> "+newBook);
		
		boolean result = service.writeWithDataStream(book, new File("Book.txt"));
		
		if(result) {
			System.out.println("Write completed");
		}
		else {
			System.out.println("Error- check");
		}
		
		Book newBook = service.readWithDataStream(new File("Book.txt"));
		System.out.println("Read Fom File ==> "+newBook.toString());
	}

}

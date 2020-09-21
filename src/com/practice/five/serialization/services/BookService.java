package com.practice.five.serialization.services;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.practice.five.serialization.Book;

public class BookService {

	public boolean writeObject(Book book) {
		boolean persisted = false;
		
		ObjectOutputStream outStream = null;
		
		try {
			outStream = new ObjectOutputStream(new FileOutputStream(new File("book.ser")));
			
			outStream.writeObject(book);
			persisted = true;
			
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		
		finally {
			try {
				outStream.close();
			}
			catch(IOException e) {
				System.err.println(e.getMessage());
			}
		}
		
		return persisted;
	}
	
	public Book readObject() {
		Book book = null;
		
		ObjectInputStream inStream = null;
		
		try {
			inStream = new ObjectInputStream(new FileInputStream(new File("book.ser")));
			book = (Book)inStream.readObject();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		finally {
			try {
				inStream.close();
			}
			catch(IOException e) {
				System.err.println(e.getMessage());
			}
		}
		return book;
	}
	
	public boolean writeWithDataStream(Book bk, File file) {
		
		DataOutputStream out = null;
		boolean flag = false;
		try {
			out = new DataOutputStream(new FileOutputStream(file));
			out.writeUTF(bk.toString());
			flag = true;
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		finally {
			try {
				out.close();
			}
			catch(IOException e) {
				System.err.println(e.getMessage());
			}
		}
		return flag;
	}
	
	public Book readWithDataStream(File file) {
		
		Book book = new Book();
		String readFromFile = "";
		String[] splitBook;
		DataInputStream in = null;
		try {
			in = new DataInputStream(new FileInputStream(file));
			if(in.available()>0) {
				readFromFile = in.readUTF();
				splitBook = readFromFile.split(", ");
				book.setBookNumber(Integer.parseInt(splitBook[0]));
				book.setBookName(splitBook[1]);
				book.setAuthor(splitBook[2]);
				book.setPrice(Double.parseDouble(splitBook[3]));
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		finally {
			try {
				in.close();
			}
			catch(IOException e) {
				System.err.println(e.getMessage());
			}
		}
		
		return book;
	}
}

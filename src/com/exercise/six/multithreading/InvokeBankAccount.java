package com.exercise.six.multithreading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class InvokeBankAccount implements Runnable {

	public void writeToFile(File file, BankAccount account) {
		PrintWriter writer = null;
		
		try {
//			writer = new PrintWriter(new FileWriter(file,true));
			writer = new PrintWriter(file);
			writer.println(account.toString());
		} 
		
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		finally {
			writer.close();
		}
	}
	
	public void readFromFile(File file) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			while((line=reader.readLine())!=null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}

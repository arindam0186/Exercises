package com.practice.four.IOExamples;

import java.io.*;

import com.practice.four.exceptionHandling.Customer;

public class FilesExample {

	public void writeToFile(File file, Customer cust) {
		
		PrintWriter writer = null;
		
		try {
//			writer = new PrintWriter(new FileWriter(file,true));
			writer = new PrintWriter(file);
			writer.println(cust.toString());
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

	public void readFromFile(File file) throws IOException {
		// TODO Auto-generated method stub
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			while((line=reader.readLine())!=null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

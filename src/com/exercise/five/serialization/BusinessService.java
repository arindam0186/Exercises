package com.exercise.five.serialization;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

import com.practice.five.serialization.Book;

public class BusinessService {

	public boolean store(CreditCard[] cards, int type) {
		
		return type==1?storeObject("",cards):storeCharacter("",cards);
		
	}
	
	private boolean storeCharacter(String path, CreditCard[] cards) {
		// TODO Auto-generated method stub
		boolean persisted = false;
		
		PrintWriter writer = null;
		try {
			writer = new PrintWriter(new FileWriter(path+"Cards.txt"));
			for(CreditCard card: cards) {
				writer.println(card.getCardNumber());
				writer.println(card.getCardHolderName());
			}
			persisted = true;
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		finally {
			try {
				writer.close();
			}
			catch(Exception e) {
				System.err.println(e.getMessage());
			}
		}
		
		return persisted;
	}

	private boolean storeObject(String path, CreditCard[] cards) {
		// TODO Auto-generated method stub
		boolean persisted = false;
		
		ObjectOutputStream outStream = null;
		
		try {
			outStream = new ObjectOutputStream(new FileOutputStream(new File(path+"Cards.ser")));
			
			for(CreditCard card: cards) {
				outStream.writeObject(card);
			}
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

	public boolean store(CreditCard[] cards, String path, int type) {
		return type==1?storeObject(path,cards):storeCharacter(path,cards);		
	}
	
	public CreditCard[] retrieve(int type) {
		return type==1?retrieveObject(""):retrieveCharacter("");
		
	}
	
	private CreditCard[] retrieveCharacter(String path) {
		CreditCard[] cards = new CreditCard[3];
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(path+"Cards.txt"));
			int character;
			String cardString = "";
			while((character=reader.read())!=-1) {
				cardString = cardString + (char)character;
			}
			String cardSplit[] = cardString.split("\\R");
			int count = 0;
			for(int i=0;i<cards.length;i++) {
				
				cards[i].setCardNumber(Integer.parseInt(cardSplit[count++]));
				cards[i].setCardHolderName(cardSplit[count++]);
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return cards;
	}

	public CreditCard[] retrieveObject(String path) {
		CreditCard[] cards = new CreditCard[3];
		ObjectInputStream inStream = null;
		
		try {
			inStream = new ObjectInputStream(new FileInputStream(new File(path+"Cards.ser")));
			for(int i=0;i<3;i++) {
				cards[i] = (CreditCard) inStream.readObject();
			}
			}
		catch (Exception e) {
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
		
		return cards;
		
	}
	
	public CreditCard[] retrieve(String path, int type) {
		return type==1?retrieveObject(path):retrieveCharacter(path);
		
	}
	
	public CreditCard[] deleteFromFile(CreditCard[] cards, String cardHolderName) {
		
		int posToDelete = 0;
		for(int i=0;i<cards.length;i++) {
			if(cards[i].getCardHolderName().equals(cardHolderName)) {
				posToDelete = i;
				break;
			}
		}
		CreditCard[] newCards = new CreditCard[cards.length-1];
		int count = 0;
		for(int i=0;i<cards.length;i++) {
			if(i!=posToDelete) {
				newCards[count++] = cards[i];
			}
		}
		return newCards;
	}
}

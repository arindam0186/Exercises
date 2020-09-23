package com.practice.six.collection.set;

import java.util.*;

import com.practice.six.collection.entity.Invoice;

public class UsingMapAPI {

	public static void main(String[] args) {

		Invoice ram = new Invoice(101, "Ramesh", 4500);
		Invoice ram2 = new Invoice(101, "Ramesh Dubey", 4500);
		Invoice raj = new Invoice(102, "Rajesh", 5500);
		Invoice rak = new Invoice(103, "Rakesh", 5500);
		
		HashMap<Integer, Invoice> invList = new HashMap<Integer, Invoice>();
		
		invList.put(901, rak);
		invList.put(902, ram);
		Invoice response = invList.put(902, ram2);
		invList.put(903, raj);
		
		System.out.println(response);
		System.out.println("Size ==> "+invList.size());
		
		System.out.println(invList.get(903));

		Set<Map.Entry<Integer, Invoice>> set = invList.entrySet();
				
		for(Map.Entry<Integer, Invoice> eachEntry: set) {
			System.out.println(eachEntry.getKey());
			System.out.println(eachEntry.getValue());
		}
		
		
	}

}

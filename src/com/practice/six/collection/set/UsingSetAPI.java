package com.practice.six.collection.set;

import java.util.HashSet;
import java.util.TreeSet;

import com.practice.six.collection.entity.Invoice;
import com.practice.six.collection.utils.AmountComparator;

public class UsingSetAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Invoice ram = new Invoice(101, "Ramesh", 4500);
		Invoice raj = new Invoice(102, "Rajesh", 5500);
		Invoice rak = new Invoice(103, "Rakesh", 2500);
		Invoice ram2 = new Invoice(101, "Ramesh", 4500);
		
		HashSet<Invoice> set = new HashSet<>();
		
		set.add(rak);
		set.add(raj);
		set.add(ram);
		boolean isAdded = set.add(ram2);
		
		System.out.println(isAdded);
		
		for(Invoice invoice: set) {
			System.out.println(invoice);
		}
		
		TreeSet<Invoice> treeSet = new TreeSet<>(new AmountComparator());
		
		treeSet.add(raj);
		treeSet.add(rak);
		treeSet.add(ram);
		boolean isAddedToTree = set.add(ram2);
		
		System.out.println(isAddedToTree);
		
		for(Invoice invoice: treeSet) {
			System.out.println(invoice);
		}
		
		
	}

}

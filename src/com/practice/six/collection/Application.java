package com.practice.six.collection;

import java.util.Collection;
import java.util.Iterator;

import com.practice.six.collection.daos.InvoiceDAOImpl;
import com.practice.six.collection.entity.Invoice;

public class Application {
	
	public static void printList(Collection<Invoice> invList) {
		
		Iterator<Invoice> iterator = invList.iterator();
		
		while(iterator.hasNext()) {
			Invoice inv = iterator.next();
			System.out.println(inv);
		}
		
	}

	public static void main(String[] args) {

		Invoice ram = new Invoice(101, "Ramesh", 4500);
		Invoice raj = new Invoice(102, "Rajesh", 5500);
		Invoice rak = new Invoice(103, "Rakesh", 6500);
		Invoice kam = new Invoice(104, "Mankesh", 7500);
		Invoice ari = new Invoice(105, "Arindam", 8500);
		
		InvoiceDAOImpl dao = new InvoiceDAOImpl();
		
		dao.add(ram);
		
		dao.add(raj, rak, kam);
		
		Collection<Invoice> invList = dao.findAll();
		
		printList(invList);
		
//		dao.remove(kam);
//		
//		System.out.println("After removing ==> ");
//		printList(invList);
		
		dao.update(kam, ari);
		
		System.out.println("After updating ==> ");
		printList(invList);
		
		Invoice search = dao.findById(105);
		
		if(search == null) {
			System.out.println("Invoice not found!");
		}
		else {
			System.out.println("Found ==> "+search);
		}

		
	}

}

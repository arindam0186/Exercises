package com.practice.six.collection.utils;

import java.util.Comparator;

import com.practice.six.collection.entity.Invoice;

public class InvoiceNumberComparator implements Comparator<Invoice> {

	@Override
	public int compare(Invoice object1, Invoice object2) {
		
		if(object1.getInvoiceNumber()<object2.getInvoiceNumber()) return -1;
		if(object1.getInvoiceNumber()>object2.getInvoiceNumber()) return 1;
		return 0;
	}


}

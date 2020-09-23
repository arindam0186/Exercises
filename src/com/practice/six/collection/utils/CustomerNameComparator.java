package com.practice.six.collection.utils;

import java.util.Comparator;

import com.practice.six.collection.entity.Invoice;

public class CustomerNameComparator implements Comparator<Invoice> {

	@Override
	public int compare(Invoice object1, Invoice object2) {

		return object1.getCustomerName().compareTo(object2.getCustomerName());
	}


}

package com.practice.six.collection.daos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.practice.six.collection.entity.Invoice;
import com.practice.six.collection.ifaces.InvoiceDAO;
import com.practice.six.collection.utils.CustomerNameComparator;
import com.practice.six.collection.utils.InvoiceNumberComparator;

public class InvoiceDAOImpl implements InvoiceDAO {
	
	private List<Invoice> invList;
	
	public InvoiceDAOImpl() {
		super();
		this.invList = new ArrayList<Invoice>();
	}

	@Override
	public Collection<Invoice> findAll() {
		return this.invList;
	}

	@Override
	public boolean add(Invoice entity) {
		return this.invList.add(entity);
	}

	@Override
	public Invoice findById(int id) {
		
		Iterator<Invoice> iterator = this.invList.iterator();
		
		while(iterator.hasNext()) {
			Invoice invoice = iterator.next();
			if(invoice.getInvoiceNumber() == id) {
				return invoice;
			}
		}
		return null;
	}

	@Override
	public boolean add(Invoice... invoices) {

		boolean result = false;
		for(Invoice invoice: invoices) {
			add(invoice);
			result = true;
		}
		
		return result;
	}

	@Override
	public boolean remove(Invoice entity) {
		
		return this.invList.remove(entity);
	}

	@Override
	public boolean update(Invoice entityToBeUpdated, Invoice entityToUpdate) {
		
		int index = 0;
		boolean result = false;
		if(this.invList.contains(entityToBeUpdated)) {
			index = this.invList.indexOf(entityToBeUpdated);
			this.invList.set(index, entityToUpdate);
			result = true;
		}
		return result;
	}

	@Override
	public Collection<Invoice> sortedByInvoiceNumber() {
		
		Collections.sort(this.invList);
		return this.invList;
	}

	@Override
	public Collection<Invoice> sortedBy(String propName) {
		
		switch(propName) {
		case "InvoiceNumber":
			Collections.sort(this.invList, new InvoiceNumberComparator());
			return this.invList;
		case "CustomerName":
			Collections.sort(this.invList, new CustomerNameComparator());
			return this.invList;
		}
		return null;
	}

}

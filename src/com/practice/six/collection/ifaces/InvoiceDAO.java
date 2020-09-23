package com.practice.six.collection.ifaces;

import java.util.Collection;

import com.practice.six.collection.entity.Invoice;

public interface InvoiceDAO {

	Collection<Invoice> findAll();
	boolean add(Invoice entity);
	boolean add(Invoice ...invoices);
	Invoice findById(int id);
	boolean remove(Invoice entity);
	boolean update(Invoice entityToBeUpdated, Invoice entityToUpdate);
}

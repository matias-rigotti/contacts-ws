package com.matias.contacts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matias.contacts.dao.ContactRepository;
import com.matias.contacts.entity.Contact;

@Service
public class ContactService {
	@Autowired
	ContactRepository dao;
	
	public Contact save (Contact contact) {
		return dao.saveAndFlush(contact);
	}
}

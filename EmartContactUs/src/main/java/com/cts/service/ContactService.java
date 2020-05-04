package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.dao.ContactRepository;
import com.cts.model.ContactUs;

@Service
public class ContactService {
	@Autowired
	ContactRepository repo;

	public List<ContactUs> getAllContacts() {
		

		return (List<ContactUs>)repo.findAll();
		
	}

	public void addContactUs(ContactUs contact) {
		repo.save(contact);
	

}
}
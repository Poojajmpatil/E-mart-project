package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.model.ContactUs;
import com.cts.service.ContactService;


@RestController
@CrossOrigin
public class ContactController {
	@Autowired
	ContactService service;

	@RequestMapping("/contacts")
	List<ContactUs> getAllContacts() {
		return service.getAllContacts(); 
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/contacts")
	void addContactUs(@RequestBody ContactUs contact) {
		System.out.println("email: " + contact.getEmail());
		service.addContactUs(contact);
	}

}

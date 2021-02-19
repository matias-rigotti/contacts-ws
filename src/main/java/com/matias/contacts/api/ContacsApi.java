package com.matias.contacts.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.matias.contacts.entity.Contact;
import com.matias.contacts.service.ContactService;

@RestController
public class ContacsApi {
	@Autowired
	ContactService contactService;
	
	@RequestMapping(value="/product", method=RequestMethod.GET)
	public Contact getById(){
        return new Contact(1L, "John", "Doe", "+57 311 222 3344", "john@sinbugs.com");
    }
	
	@RequestMapping(value="/contact", method=RequestMethod.POST)
	public Contact updateOrSave (@RequestBody Contact contact) {
		return contactService.save(contact);
	}
}

package com.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.entity.ContactEntity;
import com.contact.service.ContactService;

@RestController
@RequestMapping("/usercontact")
public class ContactController {
	@Autowired
	private ContactService contactService;
	
@GetMapping("/contact/{userId}")
public List<ContactEntity> getContact(@PathVariable("userId") Long userId){
	return contactService.getUserContacts(userId);
}
}

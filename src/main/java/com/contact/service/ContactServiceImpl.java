package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.ContactEntity;
@Service
public class ContactServiceImpl implements ContactService{

	List<ContactEntity> contatList=List.of(
			new ContactEntity(11L, "Rana Singha", "ranasng01@gmail.com", 1l),
			new ContactEntity(12L, "Raja Singha", "raja@gmail.com", 1l),
			new ContactEntity(13L, "Biplab", "biplab@gmail.com", 2l),
			new ContactEntity(14L, "Ratan", "Ratan@gmail.com", 1l),
			new ContactEntity(15L, "Babul", "babul@gmail.com", 2l),
			new ContactEntity(16L, "Nirmal", "nirmal@gmail.com", 3l),
			new ContactEntity(17L, "Parimal", "Parimal@gmail.com", 4l),
			new ContactEntity(18L, "Uttam", "Uttam@gmail.com", 5l)
			);
	@Override
	public List<ContactEntity> getUserContacts(Long userId) {
		// TODO Auto-generated method stub
		return contatList.stream().filter(contact->contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}

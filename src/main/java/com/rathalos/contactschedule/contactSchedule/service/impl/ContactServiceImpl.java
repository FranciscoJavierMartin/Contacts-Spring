package com.rathalos.contactschedule.contactSchedule.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.rathalos.contactschedule.contactSchedule.component.ContactConverter;
import com.rathalos.contactschedule.contactSchedule.entity.Contact;
import com.rathalos.contactschedule.contactSchedule.model.ContactModel;
import com.rathalos.contactschedule.contactSchedule.repository.ContactRepository;
import com.rathalos.contactschedule.contactSchedule.service.ContactService;

@Service("contactServiceImpl")
public class ContactServiceImpl implements ContactService{

	@Autowired
	@Qualifier("contactRepository")
	private ContactRepository contactRepository;
	
	@Autowired
	@Qualifier("contactConverter")
	private ContactConverter contactConverter;
	
	@Override
	public ContactModel addContact(ContactModel contactModel) {
		Contact contact=contactRepository.save(contactConverter.convertContactModel2Contact(contactModel));
		return contactConverter.convertContact2ContactModel(contact);
	}

	
}

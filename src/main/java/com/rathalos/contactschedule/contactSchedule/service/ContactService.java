package com.rathalos.contactschedule.contactSchedule.service;

import java.util.List;

import com.rathalos.contactschedule.contactSchedule.entity.Contact;
import com.rathalos.contactschedule.contactSchedule.model.ContactModel;

public interface ContactService {

	public abstract ContactModel addContact(ContactModel contactModel);
	
	public abstract List<ContactModel> listAllContacts();
	
	public abstract Contact findContactById(int id);
	
	public abstract void removeContact(int id);
	
	public ContactModel findContactModelById(int id);

}

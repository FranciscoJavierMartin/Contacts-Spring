package com.rathalos.contactschedule.contactSchedule.component;

import org.springframework.stereotype.Component;

import com.rathalos.contactschedule.contactSchedule.entity.Contact;
import com.rathalos.contactschedule.contactSchedule.model.ContactModel;

@Component("contactConverter")
public class ContactConverter {
	
	public Contact convertContactModel2Contact(ContactModel contactModel){
		Contact contact =new Contact();
		
		contact.setCity(contactModel.getCity());
		contact.setFirstname(contactModel.getFirstname());
		contact.setLastname(contactModel.getLastname());
		contact.setTelephone(contactModel.getTelephone());
		
		return contact;
	}
	
	public ContactModel convertContact2ContactModel(Contact contact){
		ContactModel contactModel=new ContactModel();
		
		contactModel.setCity(contact.getCity());
		contactModel.setFirstname(contact.getFirstname());
		contactModel.setLastname(contact.getLastname());
		contactModel.setTelephone(contact.getTelephone());
		
		return contactModel;
	}

}

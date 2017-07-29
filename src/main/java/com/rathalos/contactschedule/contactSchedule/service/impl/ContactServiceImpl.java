package com.rathalos.contactschedule.contactSchedule.service.impl;

import java.util.ArrayList;
import java.util.List;

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

	@Override
	public List<ContactModel> listAllContacts() {
		List<Contact> lista=contactRepository.findAll();
		List<ContactModel> res=new ArrayList<ContactModel>();
		
		for(Contact c:lista){
			res.add(contactConverter.convertContact2ContactModel(c));
		}
		
		return res;
	}

	@Override
	public Contact findContactById(int id) {
		// TODO Auto-generated method stub
		return contactRepository.findById(id);
	}
	
	public ContactModel findContactModelById(int id){
		return contactConverter.convertContact2ContactModel(findContactById(id));
	}

	@Override
	public void removeContact(int id) {
		// TODO Auto-generated method stub
		Contact contact=findContactById(id);
		if(null!=contact){
			contactRepository.delete(contact);
		}
	}
	
	

	
}

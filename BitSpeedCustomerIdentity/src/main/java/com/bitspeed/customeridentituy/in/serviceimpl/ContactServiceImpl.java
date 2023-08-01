package com.bitspeed.customeridentituy.in.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitspeed.customeridentituy.in.model.ContactEntity;
import com.bitspeed.customeridentituy.in.model.IdentifyRequest;
import com.bitspeed.customeridentituy.in.repository.ContactRepository;

@Service
public class ContactServiceImpl {
	

	@Autowired
	private ContactRepository contactRepository;

	public ContactServiceImpl(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public ContactEntity consolidateContact(IdentifyRequest request) {
        ContactEntity contactEntity = new ContactEntity();
        contactEntity.setEmails(new ArrayList<>(request.getEmails()));
        contactEntity.setPhoneNumbers(new ArrayList<>(request.getPhoneNumbers()));

        List<Integer> secondaryContactIds = new ArrayList<>(request.getSecondaryContactIds());
        contactEntity.setSecondaryContactIds(secondaryContactIds);

        ContactEntity savedContact = contactRepository.save(contactEntity);

        //IdentifyResponse response = new IdentifyResponse();
        contactEntity.setPrimaryContact(savedContact);

        return contactEntity;

}}

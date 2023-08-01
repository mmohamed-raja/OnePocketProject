package com.bitspeed.customeridentituy.in.model;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ContactEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ElementCollection
    private List<String> emails;

    @ElementCollection
    private List<String> phoneNumbers;

    @ElementCollection
    private List<Integer> secondaryContactIds;
    
    @ElementCollection
    private List<String> primaryContact;
    
    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public List<Integer> getSecondaryContactIds() {
        return secondaryContactIds;
    }

    public void setSecondaryContactIds(List<Integer> secondaryContactIds) {
        this.secondaryContactIds = secondaryContactIds;
    }

	public void setPrimaryContact(ContactEntity savedContact, List<String> primaryContact) {
		this.primaryContact = primaryContact; 		
	}

	public void setPrimaryContact(ContactEntity savedContact) {
		// TODO Auto-generated method stub
		
	}
}


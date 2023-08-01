package com.bitspeed.customeridentituy.in.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bitspeed.customeridentituy.in.model.ContactEntity;
import com.bitspeed.customeridentituy.in.model.IdentifyRequest;
import com.bitspeed.customeridentituy.in.service.ContactService;

@RestController
@Component
public class CustomerIdentityController {
	
	@Autowired
	private ContactService contactService;

    public CustomerIdentityController(ContactService contactService) {
        this.contactService = contactService;
    }

    @PostMapping("/identify")
    public ResponseEntity<ContactEntity> identifyContact(@RequestBody IdentifyRequest request) {
        ContactEntity response = contactService.consolidateContact(request);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

}

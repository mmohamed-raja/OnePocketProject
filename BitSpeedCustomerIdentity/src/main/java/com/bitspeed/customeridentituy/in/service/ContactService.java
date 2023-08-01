package com.bitspeed.customeridentituy.in.service;

import com.bitspeed.customeridentituy.in.model.ContactEntity;
import com.bitspeed.customeridentituy.in.model.IdentifyRequest;

public interface ContactService {
	ContactEntity consolidateContact(IdentifyRequest request);
}

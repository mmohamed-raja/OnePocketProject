package com.bitspeed.customeridentituy.in.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.bitspeed.customeridentituy.in.model.ContactEntity;

public abstract class ContactRepository implements JpaRepository<ContactEntity, Long> {


}

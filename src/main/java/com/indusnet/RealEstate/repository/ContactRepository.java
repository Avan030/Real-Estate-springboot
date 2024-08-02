package com.indusnet.RealEstate.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.indusnet.RealEstate.model.Contact;

@Repository
public interface ContactRepository extends MongoRepository<Contact, String> {
}

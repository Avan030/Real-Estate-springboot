package com.indusnet.RealEstate.service;

import java.util.List;

import com.indusnet.RealEstate.model.Contact;

public interface ContactService {
    List<Contact> getAllContacts();

    Contact createContact(Contact contact);
}

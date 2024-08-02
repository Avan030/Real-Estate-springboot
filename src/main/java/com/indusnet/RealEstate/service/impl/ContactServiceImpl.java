package com.indusnet.RealEstate.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indusnet.RealEstate.model.Contact;
import com.indusnet.RealEstate.repository.ContactRepository;
import com.indusnet.RealEstate.service.ContactService;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
    private ContactRepository contactRepository;
    @Override
    public Contact createContact(Contact contact) {
        return contactRepository.save(contact);
    }
    @Override
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }
}

package com.zohocrm8.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zohocrm8.entities.Contact;

@Service
public interface ContactServices {
public void saveContact(Contact contact);

public List<Contact> getAllContacts();

public Contact getById(int id);
}

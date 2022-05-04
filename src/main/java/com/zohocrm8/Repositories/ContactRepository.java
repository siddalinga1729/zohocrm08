package com.zohocrm8.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zohocrm8.entities.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {
//inheritance is done here
}

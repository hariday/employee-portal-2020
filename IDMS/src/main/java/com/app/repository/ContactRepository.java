package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

}

package com.matias.contacts.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matias.contacts.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long>{

}

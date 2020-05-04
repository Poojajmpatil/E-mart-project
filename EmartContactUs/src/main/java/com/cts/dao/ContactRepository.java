package com.cts.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.cts.model.ContactUs;


public interface ContactRepository extends CrudRepository<ContactUs,Integer>{
	Optional<ContactUs> findById(int id);

}

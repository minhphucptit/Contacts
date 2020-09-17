package com.example.services;

import java.util.List;
import java.util.Optional;

import com.example.entities.UserContact;

public interface ContactService {
	Iterable<UserContact> findAll();

	List<UserContact> search(String term);
	
	Optional<UserContact> findOne(Integer id);

	void save(UserContact contact);

	void delete(Integer id);
}

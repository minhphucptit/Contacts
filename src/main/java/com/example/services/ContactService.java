package com.example.services;

import java.util.List;

import com.example.entities.UserContact;

public interface ContactService {
	Iterable<UserContact> findAll();

	List<UserContact> search(String term);

	void save(UserContact contact);

	void delete(Integer id);
}

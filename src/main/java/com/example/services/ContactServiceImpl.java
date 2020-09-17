package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.UserContact;
@Service
public class ContactServiceImpl implements ContactService {
	@Autowired
	private ContactRepository contactrepository;

	@Override
	public Iterable<UserContact> findAll() {
		return contactrepository.findAll();
	}

	@Override
	public List<UserContact> search(String term) {
		return contactrepository.findByName(term);
	}
    
	@Override
	public Optional<UserContact> findOne(Integer id) {
		return contactrepository.findById(id);
	}
	@Override
	public void save(UserContact contact) {
		contactrepository.save(contact);
	}

	@Override
	public void delete(Integer id) {
		contactrepository.deleteById(id);
	}
}

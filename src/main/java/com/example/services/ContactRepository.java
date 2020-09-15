package com.example.services;

import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.UserContact;
@Repository
public interface ContactRepository extends CrudRepository<UserContact,Integer> {
   List<UserContact> findByName(final String term);
}

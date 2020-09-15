package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.services.ContactService;

@Controller
public class ContactsController {
  @Autowired
  private ContactService contactService;
  
  @RequestMapping("/contact")
  public String Lists(Model model) {
	  model.addAttribute("contacts", contactService.findAll());
	  return "List";
  }
}

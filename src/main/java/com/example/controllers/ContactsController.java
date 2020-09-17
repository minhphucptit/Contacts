package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.entities.UserContact;
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
  @GetMapping("/contact/{id}/delete")
  public String delete(@PathVariable int id) {
	  System.out.println(id);
	  contactService.delete(id);
	  return "redirect:/contact";
  }
  @PostMapping("/contact/save")
  public String save( UserContact contact) {
	  contactService.save(contact);
	  return "redirect:/contact";
  }
  @GetMapping("/contact/{id}/edit")
  public String edit(@PathVariable("id") int id,Model model) {
	  model.addAttribute("contact", contactService.findOne(id));
	  return "Form";
  }
  @RequestMapping("/contact/add")
  public String add(Model model) {
	  model.addAttribute("contact",new UserContact());
	  return "Form";
  }
}

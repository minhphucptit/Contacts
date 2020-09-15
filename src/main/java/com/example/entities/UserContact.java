package com.example.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contacts")
public class UserContact {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name="id_contact",nullable =false)
   public int id;
   @Column(name="contact_name")
   private String name;
   @Column(name="email")
   private String email;
   @Column(name="address")
   private String address;
   public UserContact() {
	   super();
   }
   public UserContact(String name,String email,String address) {
	   this.name =name;
	   this.email=email;
	   this.address=address;
   }
   
   public void setName(String name) {
	   this.name = name;
   }
   public String getName() {
	   return name;
   }
   public void setEmail(String email) {
	   this.email = email;
   }
   public String getEmail() {
	   return email;
   }
   public void setAddress(String address) {
	   this.address = address;
   }
   public String getAddress() {
	   return address;
   }
}

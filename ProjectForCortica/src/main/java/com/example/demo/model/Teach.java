package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Teach {

	   @Id
	   @GeneratedValue(strategy=GenerationType.AUTO)
	    private Long id;

	    private String name;
	    private String email;
	    private String pass;
	    private boolean active;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPass() {
			return pass;
		}
		public void setPass(String pass) {
			this.pass = pass;
		}
		public boolean isActive() {
			return active;
		}
		public void setActive(boolean active) {
			this.active = active;
		}
		@Override
		public String toString() {
			return "Teach [id=" + id + ", name=" + name + ", email=" + email + ", pass=" + pass + ", active=" + active
					+ "]";
		}
	    
	    
}

package com.anand.rws.services.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Candidate {
	
	private @Id @GeneratedValue Long id;
	  private String name;
	  private String role;
	  
	public Candidate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Candidate(String name, String role) {
		super();
		this.name = name;
		this.role = role;
	}

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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	  
	  

}

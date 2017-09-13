package com.libertymutual.goforcode.invoicify.models;

import javax.persistence.*;

@Entity
public class UserRole {

	// ENTITIES
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(nullable=false)
	private String name;
	
	@ManyToOne
	private User user;

	// CONSTRUCTORS
	public UserRole() {}
	
	public UserRole(String name, User user) {
		this.name = name;
		this.user = user;
	}
	
	// GETTERS AND SETTERS
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}

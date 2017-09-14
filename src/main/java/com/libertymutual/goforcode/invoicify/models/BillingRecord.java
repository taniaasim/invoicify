package com.libertymutual.goforcode.invoicify.models;

import java.sql.Date;

import javax.persistence.*;

@Entity
public abstract class BillingRecord {

	// ENTITIES
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne // USER NEEDS A ONE TO MANY REFERENCE TO CREATEDBY
	private User createdBy;
	
	@Column
	private Date createdOn;
	
	@Column
	private String description;	
	
	@Column
	public abstract double getTotal();

	// GETTERS AND SETTERS
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}

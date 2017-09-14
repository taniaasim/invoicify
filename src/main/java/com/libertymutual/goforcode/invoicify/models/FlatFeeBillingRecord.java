package com.libertymutual.goforcode.invoicify.models;

import javax.persistence.*;

@Entity
public class FlatFeeBillingRecord extends BillingRecord {
	
	//ENTITES
	
	@Column
	private Double amount;
	
	@Override
	public double getTotal() {
		return amount;
	}

	// GETTERS AND SETTERS
	
	public Double getAmount() {
		return amount;
	}
	
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	
}

package com.libertymutual.goforcode.invoicify.models;

import javax.persistence.*;

@Entity
public class RateBasedBillingRecord extends BillingRecord {
	
	//ENTITES

	@Column
	private Double rate;
	
	@Column
	private Double quantity;
	
	@Override
	public double getTotal() {
		return rate * quantity;
	}
	
	// GETTERS AND SETTERS


	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

}

package com.libertymutual.goforcode.invoicify.models;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class UserTests {

	
	/* This doesn't work
	@Test
    public void test_that_getAuthorities_returns_collection_of_granted() {
	// arrange
	RateBasedBillingRecord rbbr = new RateBasedBillingRecord();
	rbbr.setRate(2.0);
	rbbr.setQuantity(5.0);
	double result = 2.0 * 5.0;
	
	// act
	RateBasedBillingRecord actualrbbr = new RateBasedBillingRecord();
	actualrbbr.setRate(2.0);
	actualrbbr.setQuantity(5.0);
	double actual = actualrbbr.getTotal();
		
	// assert
	assertThat(actual).isEqualTo(result);
	} */
	
	@Test 
	public void test_that_isAccountNonExpired_returns_true() {
		//arrange
		User person = new User();
		
		//act
		boolean result = person.isAccountNonExpired();
		
		//assert
		assertThat(result).isEqualTo(true);
	}
	
	@Test 
	public void test_that_isAccountNonLocked_returns_true() {
		//arrange
		User person = new User();
		
		//act
		boolean result = person.isAccountNonLocked();
		
		//assert
		assertThat(result).isEqualTo(true);
	}
	
	@Test 
	public void test_that_isCredentialsNonExpired_returns_true() {
		//arrange
		User person = new User();
		
		//act
		boolean result = person.isCredentialsNonExpired();
		
		//assert
		assertThat(result).isEqualTo(true);
	}
	
	@Test 
	public void test_that_isEnabled_returns_true() {
		//arrange
		User person = new User();
		
		//act
		boolean result = person.isEnabled();
		
		//assert
		assertThat(result).isEqualTo(true);
	}
	
	
	
}

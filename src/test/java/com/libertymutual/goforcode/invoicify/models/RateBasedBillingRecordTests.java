package com.libertymutual.goforcode.invoicify.models;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;


public class RateBasedBillingRecordTests {

	@Test
    public void test_that_getTotal_returns_rate_and_quantity_product() {
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
	}
}

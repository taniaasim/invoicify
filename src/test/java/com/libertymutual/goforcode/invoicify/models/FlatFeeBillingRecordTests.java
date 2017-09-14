package com.libertymutual.goforcode.invoicify.models;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class FlatFeeBillingRecordTests {

	
	@Test
    public void test_that_getTotal_returns_rate_and_quantity_product() {
	// arrange
	FlatFeeBillingRecord ffbr = new FlatFeeBillingRecord();
	ffbr.setAmount(5.0);
	
	// act
	FlatFeeBillingRecord actualffbr = new FlatFeeBillingRecord();
	actualffbr.setAmount(5.0);
	double actual = actualffbr.getTotal();
		
	// assert
	assertThat(actual).isEqualTo(5.0);
	}
}

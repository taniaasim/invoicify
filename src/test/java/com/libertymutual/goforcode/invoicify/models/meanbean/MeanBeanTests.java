package com.libertymutual.goforcode.invoicify.models.meanbean;

import org.junit.Test;
import org.meanbean.test.BeanTester;

import com.libertymutual.goforcode.invoicify.models.FlatFeeBillingRecord;
import com.libertymutual.goforcode.invoicify.models.RateBasedBillingRecord;
import com.libertymutual.goforcode.invoicify.models.User;
import com.libertymutual.goforcode.invoicify.models.UserRole;

public class MeanBeanTests {
	
	@Test
	public void testRateBasedBillingRecord() {
		BeanTester beanTester = new BeanTester();
		beanTester.testBean(RateBasedBillingRecord.class);
	}
	
	@Test
	public void testFlatFeeBillingRecord() {
		BeanTester beanTester = new BeanTester();
		beanTester.testBean(FlatFeeBillingRecord.class);
	}
	
	@Test
	public void testUser() {
		BeanTester beanTester = new BeanTester();
		beanTester.testBean(User.class);
	}
	
	@Test
	public void testUserRole() {
		BeanTester beanTester = new BeanTester();
		beanTester.testBean(UserRole.class);
	}
}

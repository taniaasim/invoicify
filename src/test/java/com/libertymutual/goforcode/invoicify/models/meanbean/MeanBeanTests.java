package com.libertymutual.goforcode.invoicify.models.meanbean;

import org.junit.Test;
import org.meanbean.test.BeanTester;
import org.meanbean.test.ConfigurationBuilder;

import com.libertymutual.goforcode.invoicify.models.FlatFeeBillingRecord;
import com.libertymutual.goforcode.invoicify.models.RateBasedBillingRecord;
import com.libertymutual.goforcode.invoicify.models.User;
import com.libertymutual.goforcode.invoicify.models.UserRole;

public class MeanBeanTests {
	
	@Test
	public void testRateBasedBillingRecord() {
		BeanTester tester = new BeanTester();
		org.meanbean.test.Configuration configuration = new ConfigurationBuilder()
				.ignoreProperty("createdOn").build();
		tester.testBean(RateBasedBillingRecord.class, configuration);
	}
	
	@Test
	public void testFlatFeeBillingRecord() {
		BeanTester tester = new BeanTester();
		org.meanbean.test.Configuration configuration = new ConfigurationBuilder()
				.ignoreProperty("createdOn").build();
		tester.testBean(FlatFeeBillingRecord.class, configuration);
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

package com.libertymutual.goforcode.invoicify.models;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class UserRoleTests {

	
	@Test
	public void test_that_UserRole_object_gets_created_with_arguments() {
		// arrange
	
		// act
		User actualUser = new User();
		UserRole actualUserRole = new UserRole("admin", actualUser);
		
		// assert
		assertThat(actualUserRole.getName()).isEqualTo("admin");
		assertThat(actualUserRole.getUser()).isSameAs(actualUser);
	
	}
	
	
	@Test
	public void test_that_UserRole_object_gets_created_without_arguments() {
		// arrange
		
		// act
		UserRole actualUserRole = new UserRole();
		
		// assert
		assertThat(actualUserRole.getName()).isNull();
		assertThat(actualUserRole.getUser()).isNull();
	
	}
}

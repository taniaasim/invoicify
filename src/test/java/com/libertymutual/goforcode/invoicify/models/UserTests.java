package com.libertymutual.goforcode.invoicify.models;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.*;

import org.junit.Test;

public class UserTests {

	
	/* This doesn't work
	@Test
    public void test_that_getAuthorities_returns_collection_of_granted() {
	// arrange
	
	// act
	
	// assert
	} */
	
	// I can't figure out how to test if the role is being added to their list
	@Test
	public void test_that_User_object_is_constructed_with_arguments() {
		//arrange
		
		//act
		User actualPerson = new User("username", "password", "admin");
	//	UserRole admin = new UserRole("tania", actualPerson);
	
		//assert
		assertThat(actualPerson.getUsername()).isSameAs("username");
		assertThat(actualPerson.getPassword()).isSameAs("password");
	//	assertThat(actualPerson.getRoles()).contains(admin);

			
	}
	
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

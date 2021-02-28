/**
 * John Elbogen
 * Version 1.0
 * CS 320
 * 2/14/21
 */
package test;

import CS320w6.Contact;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContactTest{
	
	@Test
	void testContact() {
		//Object Created test
		Contact contact = new Contact("id", "fName", "lName", "5555555555", "address");
		assertTrue(contact.getId().equals("id"));
		assertTrue(contact.getFirstName().equals("fName"));
		assertTrue(contact.getLastName().equals("lName"));
		assertTrue(contact.getPhoneNum().equals("5555555555"));
		assertTrue(contact.getFieldAddress().equals("address"));
	}
	
	@Test
	void testContactIdTooLong() {
		//Id too long test
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("idwith11cha", "fName", "lName", "5555555555", "address");
		});
	}
	
	@Test
	void testFirstNameTooLong() {
		//First name too long test
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("id", "toolongname", "lName", "5555555555", "address");
		});
	}
	
	@Test
	void testLastNameTooLong() {
		//Last name too long test
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("id", "fName", "toolongname", "5555555555", "address");
		});
	}
	
	@Test
	void testAddressTooLong() {
		//address too long test
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("id", "fName", "lName", "5555555555", "toolongAddresstoolongAddressToo");
		});
	}
	
	@Test
	void testPhoneNumTooLong() {
		//phone too long test
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("id", "fName", "lName", "55555555550", "address");
		});
	}
	
	@Test
	void testPhoneNumTooShort() {
		//phone too short test
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("id", "fName", "lName", "555555555", "address");
		});
	}
}

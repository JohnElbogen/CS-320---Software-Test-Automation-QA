/**
 * John Elbogen
 * Version 1.0
 * CS 320
 * 2/14/21
 */
package test;

import CS320w6.Contact;
import CS320w6.ContactService;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContactServiceTest{
	
	ContactService test = new ContactService();
	
	Contact testobj = new Contact("id", "fName", "lName", "5555555555", "address");
	Contact testobj2 = new Contact("id2", "fName", "lName", "5555555555", "address");
	Contact testobjUpdate = new Contact("id", "fName2", "lName2", "5555555554", "address2");
	
	
	@Test
	void testContactAdd() {
		//Clear the list before test
		ContactService.contacts.clear();
		
		//Test if Contact Added
		//add contact to list
		test.addContact(testobj);
		
		//checks the size of the list is not 0, as that would mean no object added.
		assertNotEquals(ContactService.contacts.size(), 0);
	}
	
	@Test
	void testContactAddDuplicate() {
		
		//Clear the list before test
		ContactService.contacts.clear();
		
		//Test if adding Contact Duplicate will throw error
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			test.addContact(testobj);
			test.addContact(testobj);
		});

	}
	
	@Test
	void testContactDelete() {
		
		//Clear the list before test
		ContactService.contacts.clear();
		
		//Test if Contact Deleted
		//Adds an object, then deletes the object
		test.addContact(testobj);
		test.deleteContact("id");
		
		//Check that the list has no entries and is size zero
		assertTrue(ContactService.contacts.size() == 0);
		
	}
	
	@Test
	void testContactAddMultiple() {
		
		//Clear the list before test
		ContactService.contacts.clear();
		
		//Test if Contact 1 and 2 are Added
		//adds two different objects to the list
		test.addContact(testobj);
		test.addContact(testobj2);

		//Check that list is greater than one
		assertTrue(ContactService.contacts.size() > 1);
	}
	
	@Test
	void testContactUpdate() {
		
		//Clear the list before test
		ContactService.contacts.clear();
		
		//Test if Contact Updated
		//adds an object then calls update function
		test.addContact(testobj);
		test.updateContact("id", testobjUpdate);

		//Tests that our new object was updated, by checking that the
		//only element at position 0 is now equal to our update object
		assertTrue(ContactService.contacts.get(0) == testobjUpdate);

	}
}
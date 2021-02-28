/**
 * John Elbogen
 * Version 1.0
 * CS 320
 * 2/14/21
 */
package CS320w6;
import java.util.ArrayList;
import java.util.List;

public class ContactService{
	
	//create a list of contact objects
	public static List<Contact> contacts = new ArrayList<Contact>();
	
	//iterates through contacts to check if ID exists already and throws exception
	//Parameter takes in a new contact object to be added
	//only adds if ID is unique
	public void addContact(Contact newContact) {
		for (int i = 0; i < contacts.size(); i++) {
			if (newContact.getId().equals(contacts.get(i).getId())) {
				throw new IllegalArgumentException("ID already exists");
			}
		}
		contacts.add(newContact);
	}
	
	//Iterates to find matching ID then removes that object from our array list
	//if none found, returns ID not found
	public void deleteContact(String id) {
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).getId().equals(id)){
				contacts.remove(i);
			} else {
				System.out.println("Id Not Found.");
			}
		}
	}
	
	//Finds ID to be updated, then removes the current element.
	//Adds the new updated contact
	public void updateContact(String id, Contact updatedContact) {
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).getId().equals(id)){
				contacts.remove(i);
				contacts.add(updatedContact);
			} else {
				System.out.println("Id Not Found.");
			}
		}
	}
}

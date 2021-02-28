/**
 * John Elbogen
 * Version 1.0
 * CS 320
 * 2/14/21
 */
package CS320w6;

public class Contact {
	
	String id, fname, lname, phone, address;
	
	//takes in all info for a contact object
	public Contact(String id, String fName, String lName, String phone, String address) {
		
		//checks for all length requirements
		//Also checks no null inputs
		if (id.length() > 10 || id == null) {
			throw new IllegalArgumentException("invalid ID");
		}
		if (fName.length() > 10 || fName == null) {
			throw new IllegalArgumentException("invalid First Name");
		}
		if (lName.length() > 10 || lName == null) {
			throw new IllegalArgumentException("invalid Last Name");
		}
		if (phone.length() != 10 || phone == null) {
			throw new IllegalArgumentException("invalid Phone Number");
		}
		if (address.length() > 30 || address == null) {
			throw new IllegalArgumentException("invalid Address");
		}
		
		//accepts input if no exceptions		
		this.id = id;
		this.fname = fName;
		this.lname = lName;
		this.phone = phone;
		this.address = address;
		
	}
	
	public String getId() {
		return id;
	}
	public String getFirstName() {
		return fname;
	}
	public String getLastName() {
		return lname;
	}
	public String getPhoneNum() {
		return phone;
	}
	public String getFieldAddress() {
		return address;
	}
	
}


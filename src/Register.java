
// class for registering domain name
public class Register {
	String domainName = " ";
	int value = 0;
	String time = " ";
	String provider = " ";
	int expirationDate = 1;
	String contactId = " ";

	// constructor method to set the registering domain
	public Register(String dName, int val, String unit, String prov) {
		// set the domain name, value, unit
		domainName = dName;
		value = val;
		time = unit;
		provider = prov;
		// calculate the expiration date based on the unit and value that was provided
		// some code
	}
	
	// get the domain name and the information (acts as a getter method)
	public String Request() {
		// return the concatenated string of all the information
		return domainName + " " + value + time + " " + provider + " " + contactId;
	}
	
	// send a response for registration with the name and expiration date
	public String Response() {
		return domainName + " " + expirationDate;
	}
	
	// verify that the contact is valid
	public boolean verifyContact() {
		
		// check for a few different providers
		if (provider.contains("abc") || provider.contains("pqr") || provider.contains("xyz")) {
			return true;
		} else {
			return false;
		}
		
	}
	
	// validate the input from the contact to ensure that it is correct
	public boolean validateContact(String input){
		// this is just a basic idea of implementation
		boolean valid = true;
		
		// somewhere in here you will test if the input is valid based on the different providers that are accepted
		if (valid == true) {
			return true;
		} else {
			return false;
		}
	}
	
	
	// make sure the length is adequate
	public boolean verifyLength() {
		
		if (domainName.length() >= 10) {
			return true;
		} else {
			return false;
		}
	}
}

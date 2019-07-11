
// class for deleting the domain name
import java.util.ArrayList;

// class for getting info about the domain name
public class Delete {
	String domainName = " ";
	int expirationDate = 1;
	ArrayList<Register> aList = new ArrayList<Register>();
	
	// manipulate the list to find the information regarding a specific domain name
	// the constructor will do all of the deletion because nothing else is required of this class
	public Delete (String dName, ArrayList<Register> list) {
		aList = list;
		domainName = dName;
	}
	
	public void deleteDomain(String dName) {
		// get the information for the specific domain
		for (int i = 0; i < aList.size(); i++) {
			
			// check if the specific domain name was found
			if(aList.get(i).domainName == dName) {
				aList.remove(i); // delete the domain from the list
				// delete the element from the database
				// sql query here
				
				// set the domain name to that name
				dName = aList.get(i).domainName;
				expirationDate = aList.get(i).expirationDate;
				
			}
		}
	}
	
	// get the domain name and the information (acts as a getter method)
	public String Request() {
		// return the string
		return domainName;
	}
	
	// send a response for registration with the name and expiration date
	public String Response() {
		return domainName + " " + expirationDate;
	}
}
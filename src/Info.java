import java.util.*;

// class for getting info about the domain name
public class Info {
	String domainName = " ";
	int expirationDate = 1;
	ArrayList<Register> aList = new ArrayList<Register>();
	
	// manipulate the list to find the information regarding a specific domain name
	public Info (String dName, ArrayList<Register> list) {
		aList = list;
		// get the infomration for the specific domain
		for (int i = 0; i < aList.size(); i++) {
			
			// check if the specific domain name was found
			if(aList.get(i).domainName == dName) {
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
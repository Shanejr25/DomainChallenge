
import java.util.*;

public class DNR {
 // main driver method for the program
 void main (String args[]) {
	 	 
	 	// use some method of obtaining the information about the domain
	 	// some code
	 	
	 	// store the values here
	 	String domainName = "thisisatest.com";
	 	int value = 0;
	 	String unit = "year";
	 	String provider = "abc";
	 	
	 	ArrayList<Register> list = new ArrayList<Register>();
	 	
		// ** call each of the methods for the functions of the program **\
	 	// create a register object
	 	Register regDomain = new Register(domainName, value, unit, provider);
	 	
	 	// verify the contact
	 	regDomain.verifyContact();
	 	// verify the length
	 	
	 	if (regDomain.verifyLength() == false) {
	 		// delete the created domain by setting it to null
	 		// this method of deletion isnt going to be used for the delete class
	 		regDomain = null;
	 	}
	 	
	 	// add the newly created domain to the list
	 	list.add(regDomain);
	 	// add the newly created domain to the database of domains, attached to the customer-id
	 	// some database code here, most likely SQL
	 	
	 	// get the domainName
	 	regDomain.Request();
	 	// get the response
	 	regDomain.Response();
	 	
	 	// get the info for the specified domain
		Info info = new Info(domainName, list);
		// call the info methods
		info.Request();
		info.Response();
		
		// create renewal object
		Renew renew = new Renew(domainName, list);
		// renew it
		renew.renewDomain(domainName);
		// create delete object
		Delete delete = new Delete(domainName, list);
		// delete the domain
		delete.deleteDomain(domainName);
	}
 
}

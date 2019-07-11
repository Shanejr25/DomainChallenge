import java.util.ArrayList;

// class for getting info about the domain name
public class Renew {
	String domainName = " ";
	int value = 0;
	String time = " ";
	int expirationDate = 1;
	ArrayList<Register> aList = new ArrayList<Register>();
	
	// manipulate the list to find the information regarding a specific domain name
	public Renew (String dName, ArrayList<Register> list) {
		aList = list;
		domainName = dName;
	}
	
	public void renewDomain(String dName) {
		// get the infomration for the specific domain
		for (int i = 0; i < aList.size(); i++) {
			
			// check if the specific domain name was found
			if(aList.get(i).domainName == dName) {
				// set the domain name to that name
				dName = aList.get(i).domainName;
				expirationDate = aList.get(i).expirationDate;
				time = aList.get(i).time;
				value = aList.get(i).value;
				// renew the domain
				expirationDate = changeDate(aList.get(i).expirationDate);
			}
		}
	}
	// renew the domain if it is expired
	public int changeDate(int date) {
		
		// it would be better to use an actual date variable here, but for simplicity sake
		// i will keep it as a an int otherwise it will take longer to implement
		int currentDate = 20190710;
		if (date <= currentDate) {
			// add another year to the domain
			return date+= 10000;
		}
		return date;
	}
	// get the domain name and the information (acts as a getter method)
	public String Request() {
		// return the string
		return domainName + " " + value + time;
	}
	
	// send a response for registration with the name and expiration date
	public String Response() {
		return domainName + " " + expirationDate;
	}
}
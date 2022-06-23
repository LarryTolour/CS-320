package contactService;

public class Contact {
	private final String contactID;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	private int fieldLength = 10;
	private int addressLength = 30;
	
	public Contact(String contactID, String firstName, String lastName, String phoneNumber, String address) {
		if(contactID == null || contactID.length() > fieldLength ) {
			throw new IllegalArgumentException("Cannot be null or contain more than " + fieldLength + " characters.");
		}
		
      	if(firstName == null || firstName.length() > fieldLength ) {
      		throw new IllegalArgumentException("Cannot be null or contain more than " + fieldLength + " characters.");
      	}
      	
      	if(lastName == null || lastName.length() > fieldLength ) {
      		throw new IllegalArgumentException("Cannot be null or contain more than " + fieldLength + " characters.");
      	}
      	
      	if(phoneNumber == null || phoneNumber.length() > fieldLength ) {
      		throw new IllegalArgumentException("Cannot be null or contain more than " + fieldLength + " characters.");
      	}
      	
      	if(address == null || address.length() > addressLength ) {
      		throw new IllegalArgumentException("Cannot be null or contain more than " + addressLength + " characters.");
      	}
      	
      		this.contactID = contactID;
      		this.firstName = firstName;
      		this.lastName = lastName;
      		this.phoneNumber = phoneNumber;
      		this.address = address;
	}

	public String getContactID() {
		return contactID;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}

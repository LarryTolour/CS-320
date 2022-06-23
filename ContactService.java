package contactService;

import java.util.ArrayList;

public class ContactService {

	private ArrayList<Contact> contactList;
	
	public ContactService() {
		this.contactList = new ArrayList<Contact>();
	}
	
	public boolean addContact(Contact contact) {
        for (int i = 0; i < contactList.size(); i++) {
             if (contactList.get(i).getContactID().equals(contact.getContactID())) {
                 return false;
             }
        }
        contactList.add(contact);
        return true;
    }
	
	public boolean updateContact(Contact contact) {
	      for(int i = 0; i < contactList.size(); i++) {
	        if (contactList.get(i).getContactID().equals(contact.getContactID())) {
	          contactList.set(i, contact);
	          return true;
	        }
	      }
	      return false;
	    }

	public boolean deleteContact(String id) {
      for(int i = 0; i < contactList.size(); i++) {
        if (contactList.get(i).getContactID().equals(id)) {
          contactList.remove(i);
          return true;
        }
      }
      return false;
    }

	public int numberOfContacts() {
		return contactList.size();
	}
}


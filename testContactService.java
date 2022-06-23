package contactService;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test	//Add contact
	void testUniqueIdAddContact() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("11111111", "Larry", "Cawley", "7027027002", "1 Ghostrider Ct LV, NV");
		
		assertTrue(contactService.addContact(contact));
		assertTrue(contactService.numberOfContacts() == 1);
		
	}
	
	 @Test	//Unique contact
		void testIdenticalIdAddContact() {
		ContactService contactService = new ContactService();
		Contact contact1 = new Contact("11111111", "Larry", "Cawley", "7027027002", "1 Ghostrider Ct LV, NV");
		Contact contact2 = new Contact("11111111", "Anna", "Cawley", "2072072007", "616 Ironman Dr LV, NV");
				
		assertTrue(contactService.addContact(contact1));
		
		if(contactService.addContact(contact2))
       {
         fail("This is a duplicate contact.");
       }
  }
	 
	 @Test	//Delete contact
		void testDeleteContactPerId() {
			ContactService contactService = new ContactService();
			Contact contact = new Contact("11111111", "Larry", "Cawley", "7027027002", "1 Ghostrider Ct LV, NV");
			
			assertTrue(contactService.addContact(contact));
			
			assertTrue(contactService.numberOfContacts() == 1);
			
			assertTrue(contactService.deleteContact("11111111"));
			
			assertTrue(contactService.numberOfContacts() == 0);
				
		}
	 
	 @Test	
		void testUpdateContactAllFieldsPerId() {
		 	ContactService contactService = new ContactService();
			Contact contact1 = new Contact("11111111", "Larry", "Cawley", "7027027002", "1 Ghostrider Ct LV, NV");
			Contact contact2 = new Contact("11111111", "Anna", "Cawley", "2072072007", "616 Ironman Dr LV, NV");
		 	assertTrue(contactService.addContact(contact1)); 
		 	assertTrue(contactService.updateContact(contact2));
     
      
     }

	 
	 

}

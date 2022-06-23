package contactService;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {
	
	@Test
	void testContact() {
		Contact contact = new Contact("11111111", "Larry", "Cawley", "7027027002", "1 Ghostrider Ct LV, NV");
		assertTrue(contact.getContactID().equals("11111111"));
		assertTrue(contact.getFirstName().equals("Larry"));
		assertTrue(contact.getLastName().equals("Cawley"));
		assertTrue(contact.getPhoneNumber().equals("7027027002"));
		assertTrue(contact.getAddress().equals("1 Ghostrider Ct LV, NV"));
	}

	@Test
	void testContactClassIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact(null, "Larry", "Cawley", "7027027002", "1 Ghostrider Ct LV, NV");
		});		}
	
	@Test
	void testContactClassIdToLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("11111111119", "Larry", "Cawley", "7027027002", "1 Ghostrider Ct LV, NV");
		});		}
	
	@Test
	void testContactClassFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("11111111", null, "Cawley", "7027027002", "1 Ghostrider Ct LV, NV");
		});		}
	
	@Test
	void testContactClassFirstNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("11111111", "Larryyrrall", "Cawley", "7027027002", "1 Ghostrider Ct LV, NV");
		});		}
	
	@Test
	void testContactClassLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("11111111", "Larry", null, "7027027002", "1 Ghostrider Ct LV, NV");
		});		}
	
	@Test
	void testContactClassLastNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("11111111", "Larry", "Cawleyyelwac", "7027027002", "1 Ghostrider Ct LV, NV");
		});		}
	
	@Test
	void testContactClassPhoneNumberNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("11111111", "Larry", "Cawley", null, "1 Ghostrider Ct LV, NV");
		});		}
	
	@Test
	void testContactClassPhoneNumberToLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("11111111", "Larry", "Cawley", "7027027002702", "1 Ghostrider Ct LV, NV");
		});		}
	
	@Test
	void testContactClassAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("11111111", "Larry", "Cawley", "7027027002", null);
		});		}
	
	@Test
	void testContactClassAddressToLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("11111111", "Larry", "Cawley", "7027027002", "100 Ghostrider Court Las Vegas, NV");
		});		}

}


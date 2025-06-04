package gr.aueb.cf.ch18.mobilecontacts;

import gr.aueb.cf.ch18.mobilecontacts.dao.IMobileContactDAO;
import gr.aueb.cf.ch18.mobilecontacts.dao.MobileContactDAOImpl;
import gr.aueb.cf.ch18.mobilecontacts.model.MobileContact;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        IMobileContactDAO contactDAO = new MobileContactDAOImpl();

        // Create contacts
        MobileContact contact1 = new MobileContact();
        contact1.setId(1L);
        contact1.setFirstname("Αθαν.");
        contact1.setLastname("Ανδρούτσος");
        contact1.setPhoneNumber("1234567890");


        MobileContact contact2 = new MobileContact();
        contact2.setId(2L);
        contact2.setFirstname("Λαμπρινή");
        contact2.setLastname("Λαμπρούτσου");
        contact2.setPhoneNumber("0987654321");

        // Insert contacts
        contactDAO.insert(contact1);
        contactDAO.insert(contact2);
        System.out.println("=== After insertion ===");
        contactDAO.getAll().forEach(System.out::println);

        // Get by Phonenumber
//        Optional<MobileContact> foundByPhoneNumber = contactDAO.getByPhoneNumber("1234567890");
//        foundByPhoneNumber.ifPresent(c -> System.out.println("\nFound by Tel. num. " + c.getPhoneNumber()));
        try {
            MobileContact mobileContact = contactDAO.getByPhoneNumber("1234567890").orElseThrow(() ->
                    new Exception("Contact not found") );
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // Get by id

        try {
            MobileContact foundById = contactDAO.getById(1L);
            if (foundById == null) throw new Exception("Contact with id not found");
            System.out.println(foundById);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }



        // Update contact
        MobileContact updatedContact = new MobileContact();
        updatedContact.setId(1L); // Must set ID for update
        updatedContact.setFirstname("Γιάννα");
        updatedContact.setLastname("Ανδρούτσου");
        updatedContact.setPhoneNumber("1112223333");
        contactDAO.update(1L, updatedContact);
        System.out.println("\n=== After update ===");
        contactDAO.getAll().forEach(System.out::println);

        // Delete contact
        contactDAO.deleteById(2L);
        System.out.println("\nDeleted ID 2");
        System.out.println("=== After deletion ===");
        contactDAO.getAll().forEach(System.out::println);
    }
}

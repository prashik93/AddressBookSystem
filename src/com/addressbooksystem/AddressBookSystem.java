package com.addressbooksystem;

import java.util.ArrayList;

public class AddressBookSystem {
    public ArrayList <ContactDetails> contactDetailsArrayList = new ArrayList<>();

    public void addContactDetails (ContactDetails contactDetails) {
        contactDetailsArrayList.add(contactDetails);
    }

    public void showContactDetails () {
        for (int i = 0; i < contactDetailsArrayList.size(); i++) {
            System.out.println("\nDetails : " + contactDetailsArrayList.get(i));
        }
    }
}

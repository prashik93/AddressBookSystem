package com.addressbooksystem;

import java.util.ArrayList;
import java.util.Scanner;

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

    public void editContactDetails () {
        Scanner scnr = new Scanner(System.in);
        System.out.print("\nEnter name to edit : ");
        String usrName = scnr.next();

        for (int i = 0; i < contactDetailsArrayList.size(); i++) {
            if (contactDetailsArrayList.get(i).getFirstName().equals(usrName)) {

                ContactDetails contactDetails = contactDetailsArrayList.get(i);

                System.out.print("\nEdit First Name : ");
                contactDetails.setFirstName(scnr.next());
                System.out.print("Edit Last Name : ");
                contactDetails.setLastName(scnr.next());
                System.out.print("Edit Address : ");
                contactDetails.setAddress(scnr.next());
                System.out.print("Edit City : ");
                contactDetails.setCity(scnr.next());
                System.out.print("Edit State : ");
                contactDetails.setState(scnr.next());
                System.out.print("Edit Zip Code : ");
                contactDetails.setZip(scnr.next());
                System.out.print("Edit Phone Number : ");
                contactDetails.setPhone(scnr.next());
                System.out.print("Edit Email : ");
                contactDetails.setEmail(scnr.next());
            }
        }
        ContactDetails data = contactDetailsArrayList.get(0);
        System.out.println("\nEdited Data : " + data);
    }
}

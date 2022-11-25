package com.addressbooksystem;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookSystem {
    public ArrayList <ContactDetails> contactDetailsArrayList = new ArrayList<>();

    public ContactDetails contactDetailsForm () {
        Scanner scnr = new Scanner(System.in);
        ContactDetails contactDetails = new ContactDetails();

        System.out.print("\nEnter First Name : ");
        contactDetails.setFirstName(scnr.next());
        System.out.print("Enter Last Name : ");
        contactDetails.setLastName(scnr.next());
        System.out.print("Enter Address : ");
        contactDetails.setAddress(scnr.next());
        System.out.print("Enter City : ");
        contactDetails.setCity(scnr.next());
        System.out.print("Enter State : ");
        contactDetails.setState(scnr.next());
        System.out.print("Enter Zip Code : ");
        contactDetails.setZip(scnr.next());
        System.out.print("Enter Phone Number : ");
        contactDetails.setPhone(scnr.next());
        System.out.print("Enter Email : ");
        contactDetails.setEmail(scnr.next());
        return contactDetails;
    }

    public void addContactDetails () {
        Scanner scnr = new Scanner(System.in);

        System.out.print("How many Contact details do you want to add? : ");
        int num = scnr.nextInt();
        for (int count = 0; count < num; count++) {
            ContactDetails contactDetails = contactDetailsForm();
            contactDetailsArrayList.add(contactDetails);
        }
    }
    public void showContactDetails () {
        System.out.println("\nList : " + contactDetailsArrayList);
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
    }

    public void deleteContactDetails () {
        Scanner scnr = new Scanner(System.in);
        System.out.print("\nEnter name to Delete the data : ");
        String usrName = scnr.next();

        for (int i = 0; i < contactDetailsArrayList.size(); i++) {
            if (contactDetailsArrayList.get(i).getFirstName().equals(usrName)) {
                contactDetailsArrayList.remove(i);
            }
        }
    }
}

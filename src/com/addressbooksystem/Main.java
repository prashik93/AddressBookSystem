package com.addressbooksystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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

        AddressBookSystem addressBookSystem = new AddressBookSystem();
        addressBookSystem.addContactDetails(contactDetails);
        addressBookSystem.editContactDetails();
        addressBookSystem.deleteContactDetails();
    }
}
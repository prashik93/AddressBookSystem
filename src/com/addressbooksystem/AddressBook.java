package com.addressbooksystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AddressBook {
    public ArrayList <ContactDetails> contactDetailsArrayList = new ArrayList<>();
    MultipleAddressBook multipleAddressBook = new MultipleAddressBook();

    public void contactDetailsForm (ContactDetails contactDetails) {
        Scanner scnr = new Scanner(System.in);

        System.out.print("\nEnter First Name : ");
        contactDetails.setFirstName(scnr.next().toLowerCase());
        System.out.print("Enter Last Name : ");
        contactDetails.setLastName(scnr.next().toLowerCase());
        System.out.print("Enter Address : ");
        contactDetails.setAddress(scnr.next().toLowerCase());
        System.out.print("Enter City : ");
        contactDetails.setCity(scnr.next().toLowerCase());
        System.out.print("Enter State : ");
        contactDetails.setState(scnr.next().toLowerCase());
        System.out.print("Enter Zip Code : ");
        contactDetails.setZip(scnr.next());
        System.out.print("Enter Phone Number : ");
        contactDetails.setPhone(scnr.next());
        System.out.print("Enter Email : ");
        contactDetails.setEmail(scnr.next());
    }

    public void addContactDetails () {
        Scanner scnr = new Scanner(System.in);
        System.out.print("How many Contact details do you want to add? : ");
        int num = scnr.nextInt();
        for (int count = 0; count < num; count++) {
            ContactDetails contactDetails = new ContactDetails();
            contactDetailsForm(contactDetails);
            List<ContactDetails> collect = contactDetailsArrayList.stream().filter(fn -> fn.getFirstName().equals(contactDetails.getFirstName()) && fn.getLastName().equals(contactDetails.getLastName())).collect(Collectors.toList());
            String fname = contactDetails.getFirstName();
            String lname = contactDetails.getLastName();
            if(collect.size() == 0) {
                boolean checkResult = multipleAddressBook.checkIfContactExists(fname, lname);
                if(!checkResult) {
                    contactDetailsArrayList.add(contactDetails);}
            } else {
                count--;
                System.out.println("Contact details already Exist, Please enter New One");
            }
        }
    }

    public void showContactDetails () {
        System.out.println("\nList : " + contactDetailsArrayList);
        for (ContactDetails contactDetails : contactDetailsArrayList) {
            System.out.println("\nDetails from ArrayList : " + contactDetails);
        }
    }

    public void editContactDetails(ContactDetails contactDetails) {
        Scanner scnr = new Scanner(System.in);
        if(contactDetails != null) {
            System.out.println("\nWhat do you want to edit? : ");
            System.out.println("""
                        1.Edit First Name
                        2.Edit Last Name
                        3.Edit Address
                        4.Edit City
                        5.Edit State
                        6.Edit Zip Code
                        7.Edit Phone
                        8.Edit Email
                        9.Exit""");
            System.out.print("Enter your choice : ");
            int elementForEditing = scnr.nextInt();

            switch (elementForEditing) {
                case AddressBookConstants.EDIT_FIRSTNAME -> {
                    System.out.print("Enter New First Name : ");
                    contactDetails.setFirstName(scnr.next().toLowerCase());
                }
                case AddressBookConstants.EDIT_LASTNAME -> {
                    System.out.print("Enter New Last Name : ");
                    contactDetails.setLastName(scnr.next().toLowerCase());
                }
                case AddressBookConstants.EDIT_ADDRESS -> {
                    System.out.print("Enter New Address : ");
                    contactDetails.setAddress(scnr.next().toLowerCase());
                }
                case AddressBookConstants.EDIT_CITY -> {
                    System.out.print("Enter New City Name : ");
                    contactDetails.setCity(scnr.next().toLowerCase());
                }
                case AddressBookConstants.EDIT_STATE -> {
                    System.out.print("Enter New State Name : ");
                    contactDetails.setState(scnr.next().toLowerCase());
                }
                case AddressBookConstants.EDIT_ZIPCODE -> {
                    System.out.print("Enter New Zip Code : ");
                    contactDetails.setZip(scnr.next());
                }
                case AddressBookConstants.EDIT_PHONE -> {
                    System.out.print("Enter New Phone Number : ");
                    contactDetails.setPhone(scnr.next());
                }
                case AddressBookConstants.EDIT_EMAIL -> {
                    System.out.print("Enter New Email-Id : ");
                    contactDetails.setEmail(scnr.next().toLowerCase());
                }
                case AddressBookConstants.EXIT -> {
                }
                default -> System.out.println("\nPlease give valid input!");
            }
        }
        System.out.println("\nArrayList after editing : " + contactDetailsArrayList);
    }

    public void deleteContact(ContactDetails contactDetails) {
        contactDetailsArrayList.remove(contactDetails);
    }

    public ContactDetails checkIfContactExists(String fname, String lname) {
        for (ContactDetails contactDetails : contactDetailsArrayList) {
            if ((contactDetails.getFirstName().equals(fname)) && (contactDetails.getLastName().equals(lname))) {
                System.out.println("\nPerson exist!");
                return contactDetails;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "contactDetailsArrayList=" + contactDetailsArrayList +
                '}';
    }

}

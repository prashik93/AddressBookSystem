package com.addressbooksystem;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    private static final int EDIT_FIRSTNAME = 1;
    private static final int EDIT_LASTNAME = 2;
    private static final int EDIT_ADDRESS = 3;
    private static final int EDIT_CITY = 4;
    private static final int EDIT_STATE = 5;
    private static final int EDIT_ZIPCODE = 6;
    private static final int EDIT_PHONE = 7;
    private static final int EDIT_EMAIL = 8;
    private static final int EXIT = 0;

    public ArrayList <ContactDetails> contactDetailsArrayList = new ArrayList<>();

    public void contactDetailsForm (ContactDetails contactDetails) {
        Scanner scnr = new Scanner(System.in);

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
    }

    public void addContactDetails () {
        Scanner scnr = new Scanner(System.in);

        System.out.print("How many Contact details do you want to add? : ");
        int num = scnr.nextInt();
        for (int count = 0; count < num; count++) {
            ContactDetails contactDetails = new ContactDetails();
            contactDetailsForm(contactDetails);
            for (int i = 0; i < contactDetailsArrayList.size(); i++) {
                if ((contactDetailsArrayList.get(i).getFirstName().equals(contactDetails.getFirstName())) && (contactDetailsArrayList.get(i).getLastName().equals(contactDetails.getLastName()))) {
                    System.out.println("\nPerson already exist!");
                    count--;
                    continue;
                }
            }
            contactDetailsArrayList.add(contactDetails);
        }
    }

    public void showContactDetails () {
        System.out.println("\nList : " + contactDetailsArrayList);
        for (int i = 0; i < contactDetailsArrayList.size(); i++) {
            System.out.println("\nDetails from ArrayList : " + contactDetailsArrayList.get(i));
        }
    }

    public void editContactDetails () {
        Scanner scnr = new Scanner(System.in);
        System.out.print("\nEnter First Name : ");
        String usrFirstName = scnr.next();
        System.out.print("Enter Last Name : ");
        String usrLastName = scnr.next();
        System.out.println("\nList : " + contactDetailsArrayList);

        for (int i = 0; i < contactDetailsArrayList.size(); i++) {
            if ((contactDetailsArrayList.get(i).getFirstName().equals(usrFirstName)) && (contactDetailsArrayList.get(i).getLastName().equals(usrLastName))) {
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
                    case EDIT_FIRSTNAME -> {
                        System.out.print("Enter New First Name : ");
                        contactDetailsArrayList.get(i).setFirstName(scnr.next());
                    }
                    case EDIT_LASTNAME -> {
                        System.out.print("Enter New Last Name : ");
                        contactDetailsArrayList.get(i).setLastName(scnr.next());
                    }
                    case EDIT_ADDRESS -> {
                        System.out.print("Enter New Address : ");
                        contactDetailsArrayList.get(i).setAddress(scnr.next());
                    }
                    case EDIT_CITY -> {
                        System.out.print("Enter New City Name : ");
                        contactDetailsArrayList.get(i).setCity(scnr.next());
                    }
                    case EDIT_STATE -> {
                        System.out.print("Enter New State Name : ");
                        contactDetailsArrayList.get(i).setState(scnr.next());
                    }case EDIT_ZIPCODE -> {
                        System.out.print("Enter New Zip Code : ");
                        contactDetailsArrayList.get(i).setZip(scnr.next());
                    }
                    case EDIT_PHONE -> {
                        System.out.print("Enter New Phone Number : ");
                        contactDetailsArrayList.get(i).setPhone(scnr.next());
                    }
                    case EDIT_EMAIL -> {
                        System.out.print("Enter New Email-Id : ");
                        contactDetailsArrayList.get(i).setEmail(scnr.next());
                    }
                    case EXIT -> {
                    }
                    default -> System.out.println("\nPlease give valid input!");
                }
            }
        }
        System.out.println("\nArrayList after editing : " + contactDetailsArrayList);
    }

    public void deleteContactDetails () {
        Scanner scnr = new Scanner(System.in);
        System.out.print("\nEnter First Name : ");
        String usrFirstName = scnr.next();
        System.out.print("Enter Last Name : ");
        String usrLastName = scnr.next();

        for (int i = 0; i < contactDetailsArrayList.size(); i++) {
            if ((contactDetailsArrayList.get(i).getFirstName().equals(usrFirstName)) && (contactDetailsArrayList.get(i).getLastName().equals(usrLastName))) {
                contactDetailsArrayList.remove(contactDetailsArrayList.get(i));
                return;
            }
        }
        System.out.println("\nArrayList after deleting : " + contactDetailsArrayList);
    }

    public boolean checkIfContactExists(String name) {
        for (int i = 0; i < contactDetailsArrayList.size(); i++) {
            if ((contactDetailsArrayList.get(i).getFirstName().equals(name)) && (contactDetailsArrayList.get(i).getLastName().equals(name))) {
                System.out.println("\nPerson already exist!");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "contactDetailsArrayList=" + contactDetailsArrayList +
                '}';
    }
}

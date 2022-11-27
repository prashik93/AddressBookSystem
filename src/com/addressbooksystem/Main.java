package com.addressbooksystem;

import java.util.Scanner;

public class Main {
    public static AddressBook addressBook = new AddressBook();
    public static MultipleAddressBook multipleAddressBook = new MultipleAddressBook();
    private static final int EXIT = 0;
    private static final int ADD_ADDRESS_BOOK = 1;
    private static final int PRINT_ADDRESS_BOOK = 2;
    private static final int ADD_CONTACT = 3;
    private static final int EDIT_CONTACT = 4;
    private static final int DELETE_CONTACT = 5;
    private static final int SHOW_CONTACT = 6;
    public static void main(String[] args) {
        userInput ();
    }

    public static void userInput () {
        Scanner scnr = new Scanner(System.in);

        int count = 0;
        while (count == 0) {
            System.out.println("\nWhat do you want to do?");
            System.out.println("""
                                1.Add Address Book
                                2.Print Address Book
                                3.Add Contact
                                4.Edit Contact
                                5.Delete Contact
                                6.Show Contact
                                0.Exit""");
            System.out.print("Enter your choice : ");
            int userChoice = scnr.nextInt();

            switch (userChoice) {
                case ADD_ADDRESS_BOOK -> {
                    multipleAddressBook.addMultipleAddressBook();
                }
                case PRINT_ADDRESS_BOOK ->
                    multipleAddressBook.printAddressBookMap();
                case ADD_CONTACT ->
                    addressBook.addContactDetails();
                case EDIT_CONTACT ->
                    addressBook.editContactDetails();
                case DELETE_CONTACT ->
                    addressBook.deleteContactDetails();
                case SHOW_CONTACT ->
                    addressBook.showContactDetails();
                case EXIT ->
                    count += 1;
                default ->
                    System.out.println("\nPlease give valid input!");
            }
        }
    }
}
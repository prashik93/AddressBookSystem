package com.addressbooksystem;

import java.util.Scanner;

public class Main {
    public static MultipleAddressBook multipleAddressBook = new MultipleAddressBook();
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
                                2.Add In Existing Address Book
                                3.Print Address Book
                                4.Edit Address Book's Contact Detail
                                5.Delete Address Book's Contact Detail
                                6.Search Persons By City Or State
                                7.View Persons By City
                                8.Count Persons By City Or State
                                9.Sort Entries By Persons Name
                                10.Sort Entries By City Name
                                11.Sort Entries By State Name
                                12.Sort Entries By Zip Code
                                13.Write In File Using File IO
                                14.Read From File Using File IO
                                0.Exit""");
            System.out.print("Enter your choice : ");
            int userChoice = scnr.nextInt();

            switch (userChoice) {
                case AddressBookConstants.ADD_ADDRESS_BOOK ->
                    multipleAddressBook.addMultipleAddressBook();
                case AddressBookConstants.ADD_IN_EXISTING_ADDRESS_BOOK ->
                    multipleAddressBook.chooseAddressBookToAddContact();
                case AddressBookConstants.PRINT_ADDRESS_BOOK ->
                    multipleAddressBook.printAddressBookMap();
                case AddressBookConstants.EDIT_ADDRESS_BOOK ->
                        multipleAddressBook.editAddressBookMap();
                case AddressBookConstants.DELETE_ADDRESS_BOOK ->
                        multipleAddressBook.deleteContact();
                case AddressBookConstants.SEARCH_PERSONS_BY_CITY_OR_STATE ->
                        multipleAddressBook.searchPersonsByCityOrState();
                case AddressBookConstants.VIEW_PERSONS_BY_CITY ->
                        multipleAddressBook.viewPersonsByCity();
                case AddressBookConstants.COUNT_PERSONS_BY_CITY_OR_STATE ->
                        multipleAddressBook.countPersonsByCityOrState();
                case AddressBookConstants.SORT_ENTRIES_BY_PERSONS_NAME ->
                        multipleAddressBook.sortEntriesByPersonsName();
                case AddressBookConstants.SORT_ENTRIES_BY_CITY ->
                        multipleAddressBook.sortEntriesByCityName();
                case AddressBookConstants.SORT_ENTRIES_BY_STATE ->
                        multipleAddressBook.sortEntriesByStateName();
                case AddressBookConstants.SORT_ENTRIES_BY_ZIP ->
                        multipleAddressBook.sortEntriesByZipCode();
                case AddressBookConstants.WRITE_IN_FILE_USING_IO ->
                        multipleAddressBook.writeInAddressBookFile();
                case AddressBookConstants.READ_FROM_FILE_USING_IO ->
                        multipleAddressBook.readFromAddressBookFile();
                case AddressBookConstants.EXIT ->
                    count += 1;
                default ->
                    System.out.println("\nPlease give valid input!");
            }
        }
    }
}
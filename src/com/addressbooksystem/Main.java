package com.addressbooksystem;

public class Main {
    public static void main(String[] args) {
       AddressBookSystem addressBookSystem = new AddressBookSystem();
       addressBookSystem.addContactDetails();
       addressBookSystem.showContactDetails();
       addressBookSystem.editContactDetails();
       addressBookSystem.deleteContactDetails();
    }
}
package com.addressbooksystem;

import java.util.*;

public class MultipleAddressBook {
    Scanner scnr = new Scanner(System.in);
    public HashMap<String, AddressBook> addressBookMap = new HashMap<>();
    private HashMap<String, List<ContactDetails>> viewPersonsByCityMap = new HashMap<>();

    public void addMultipleAddressBook() {
        System.out.print("\nHow many Address Book do you want to Create? : ");
        int addressBookCount = scnr.nextInt();

        for (int i = 0; i < addressBookCount; i++) {
            System.out.print("\nEnter address book name : ");
            String addressBookName = scnr.next();
            AddressBook addressBook = new AddressBook();

            if (addressBookMap.containsKey(addressBookName)) {
                System.out.println("\nAddress Book already exist. Please enter New One...");
                i--;
                continue;
            }
            addressBookMap.put(addressBookName, addressBook);
        }
        chooseAddressBookToAddContact();
    }

    public void chooseAddressBookToAddContact() {
        Set<String> keys = addressBookMap.keySet();
        System.out.println("Map : " + keys);
        if(keys.size() > 0) {
            System.out.println("\nAvailable Address Books are : " + keys);
            System.out.print("Please choose to add contact : ");
            String chosenAddressBook = scnr.next();
            if (addressBookMap.containsKey(chosenAddressBook)) {
                addContactInSelectedAddressBook(chosenAddressBook);
                return;
            }
            System.out.println("\nPlease choose a valid one...");
            chooseAddressBookToAddContact();
            return;
        }
        System.out.println("\nNo Address Book Available, please add a New One");
    }

    public void addContactInSelectedAddressBook(String chosenAddressBook) {
        AddressBook selectedAddressBookList = addressBookMap.get(chosenAddressBook);
        selectedAddressBookList.addContactDetails();
        addressBookMap.put(chosenAddressBook, selectedAddressBookList);
    }
    public boolean checkIfContactExists(String fname, String lname) {
        Set<String> keys = addressBookMap.keySet();
        for (String key : keys) {
            AddressBook addressBook = addressBookMap.get(key);
            long collect = addressBook.contactDetailsArrayList.stream().filter(existingList ->
                    existingList.getFirstName().equals(fname)
                            && existingList.getLastName().equals(lname)).count();
            System.out.println("boolean collect : " + collect);
            if (collect > 0) {
                System.out.println("\nPerson exist!");
                return true;
            }
        }
        return false;
    }

    public void printAddressBookMap() {
        Set<String> keys = addressBookMap.keySet();
        if(keys.size() > 0) {
            for (String key : keys) {
                AddressBook addressBook = addressBookMap.get(key);
                System.out.println(key + " = " + addressBook);
            }
            return;
        }
        System.out.println("\n No Address Book Available");
    }

    public void editAddressBookMap() {
        System.out.print("\nEnter First Name : ");
        String usrFirstName = scnr.next();
        System.out.print("Enter Last Name : ");
        String usrLastName = scnr.next();
        Set<String> keys = addressBookMap.keySet();
        for (String key : keys) {
            AddressBook addressBook = addressBookMap.get(key);
            ContactDetails contactDetails = addressBook.checkIfContactExists(usrFirstName, usrLastName);
            if (contactDetails != null) {
                addressBook.editContactDetails(contactDetails);
            }
        }
    }

    public void deleteContact() {
        System.out.print("\nEnter First Name : ");
        String usrFirstName = scnr.next();
        System.out.print("Enter Last Name : ");
        String usrLastName = scnr.next();
        Set<String> keys = addressBookMap.keySet();
        for (String key : keys) {
            AddressBook addressBook = addressBookMap.get(key);
            ContactDetails contactDetails = addressBook.checkIfContactExists(usrFirstName, usrLastName);
            if (contactDetails != null) {
                addressBook.deleteContact(contactDetails);
                return;
            }
        }
        System.out.println("Contact details does not exist");
    }

    public String getCityOrState() {
        System.out.print("\nEnter City or State : ");
        String cityOrState = scnr.next().toLowerCase();
        return cityOrState;
    }

    public void searchPersonsByCityOrState() {
        String cityOrState = getCityOrState();
        System.out.print("\nEnter City or State Name : ");
        String cityOrStateName = scnr.next().toLowerCase();
        addressBookMap.values().forEach(value ->{
            value.contactDetailsArrayList.stream().filter(filteredValue -> {
                        if(cityOrState.equals("city"))
                            return filteredValue.getCity().equals(cityOrStateName);
                        else return filteredValue.getState().equals(cityOrStateName);
                    })
                    .forEach(System.out::println);
        });
    }

    public void viewPersonsByCity() {
        System.out.print("\nEnter City or State Name : ");
        String cityOrStateName = scnr.next().toLowerCase();

        List<ContactDetails> contactDetailsByCity = new ArrayList<>();
        Set<String> keys = addressBookMap.keySet();
        if (keys.size() > 0) {
            for (String key : keys) {
                AddressBook addressBook = addressBookMap.get(key);
                addressBook.contactDetailsArrayList.stream()
                        .filter(value -> value.getCity().equals(cityOrStateName)).toList()
                        .forEach(contact -> contactDetailsByCity.add(contact));
                viewPersonsByCityMap.put(cityOrStateName, contactDetailsByCity);
            }
            printPersonsByCityMap();
            return;
        }
        System.out.println("\nNo Person found with respective City");
    }

    public void printPersonsByCityMap() {
        Set<String> keys = viewPersonsByCityMap.keySet();
        if(keys.size() > 0) {
            for (String key : keys) {
                List<ContactDetails> addressBook = viewPersonsByCityMap.get(key);
                System.out.println(key + " = " + addressBook);
            }
            return;
        }
        System.out.println("\n No Address Book Available");
    }

    @Override
    public String toString() {
        return "addressBookMap=" + addressBookMap;
    }
}

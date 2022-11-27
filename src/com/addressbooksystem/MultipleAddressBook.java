package com.addressbooksystem;

import java.util.*;

public class MultipleAddressBook {
    public HashMap<String, AddressBook> addressBookMap = new HashMap<>();
    public void addMultipleAddressBook() {
        Scanner scnr = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        System.out.print("\nHow many Address Book do you want to Create? : ");
        int addressBookCount = scnr.nextInt();

        for (int i = 0; i < addressBookCount; i++) {
            System.out.print("\nEnter address book name : ");
            String addressBookName = scnr.next();
            if(addressBookMap.containsKey(addressBookName)) {
                System.out.println("\nAddress Book already exist");
                return;
            }
            addressBook.addContactDetails();
            addressBookMap.put(addressBookName, addressBook);
        }
        System.out.println(addressBookMap);
    }

    public void printAddressBookMap() {
        Set<String> keys = addressBookMap.keySet();
        Iterator<String> it = keys.iterator();
        System.out.println(addressBookMap.size());
        while (it.hasNext()) {
            String key = it.next();
            AddressBook addressBook = addressBookMap.get(key);
            System.out.println(key + " = " + addressBook);
        }
        System.out.println(addressBookMap);
    }
}

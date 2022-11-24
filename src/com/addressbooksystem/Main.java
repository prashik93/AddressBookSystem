package com.addressbooksystem;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getContactDetails();
    }

    public static void getContactDetails () {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter First Name : ");
        String firstname = scnr.next();
        System.out.print("Enter Last Name : ");
        String lastName = scnr.next();
        System.out.print("Enter Address : ");
        String address = scnr.next();
        System.out.print("Enter City : ");
        String city = scnr.next();
        System.out.print("Enter State : ");
        String state = scnr.next();
        System.out.print("Enter Zip : ");
        String zip = scnr.next();
        System.out.print("Enter Phone Number : ");
        String phone = scnr.next();
        System.out.print("Enter Email : ");
        String email = scnr.next();

        ContactDetails contactDetails = new ContactDetails(firstname, lastName, address, city, state, zip, phone, email);
        System.out.println("\nPerson Contact Details : " + contactDetails);

    }
}
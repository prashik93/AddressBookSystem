package com.addressbooksystem;

public class ContactDetails {
    private final String firstName;
    private final String lastName;
    private final String address;
    private final String city;
    private final String state;
    private final String zip;
    private final String phone;
    private final String email;

    public ContactDetails(String firstName, String lastName, String address, String city, String state, String zip,
                          String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + address + " " + city + " "
                + state + " " + zip + " " + phone + " " + email;
    }
}

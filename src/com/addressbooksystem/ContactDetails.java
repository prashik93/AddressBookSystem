package com.addressbooksystem;

public class ContactDetails {
    private String firstName;
    private String lastName;
    private  String address;
    private String city;
    private String state;
    private String zip;
    private String phone;
    private String email;

    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName () {
        return firstName;
    }

    public void setLastName (String lastName) {
        this.lastName = lastName;
    }

    public String getLastName () {
        return lastName;
    }

    public void setAddress (String address) {
        this.address = address;
    }

    public String getAddress () {
        return address;
    }

    public void setCity (String city) {
        this.city = city;
    }

    public String getCity () {
        return city;
    }

    public void setState (String state) {
        this.state = state;
    }

    public String getState () {
        return state;
    }

    public void setZip (String zip) {
        this.zip = zip;
    }

    public String getZip () {
        return zip;
    }

    public void setPhone (String phone) {
        this.phone = phone;
    }

    public String getPhone () {
        return phone;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public String getEmail () {
        return email;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + address + " " + city + " "
                + state + " " + zip + " " + phone + " " + email;
    }
}

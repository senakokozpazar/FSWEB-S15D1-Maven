package org.example;

import org.example.mobile.Contact;
import org.example.mobile.MobilePhone;
import org.example.models.Grocery;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("31415926", new ArrayList<>());
        mobilePhone.addNewContact(new Contact("Bob", "31415926"));
        mobilePhone.addNewContact(new Contact("Bob", "31415926"));
        mobilePhone.addNewContact(new Contact("Bob", "31415926"));
        mobilePhone.printContacts();
    }
}

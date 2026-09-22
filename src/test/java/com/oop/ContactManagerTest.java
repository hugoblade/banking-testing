package com.oop;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContactManagerTest {

    @Test
    void arrayListAllowsDuplicates() {
        List<String> numbers = new ArrayList<>();
        numbers.add("097");
        numbers.add("096");
        numbers.add("097");
        assertEquals(3, numbers.size());
    }

    @Test
    void hashSetRefusesDuplicates() {
        Set<String> numbers = new HashSet<>();
        numbers.add("097");
        numbers.add("096");
        numbers.add("097");
        assertEquals(2, numbers.size());
    }

    @Test
    void arrayListGrowsPastCapacity() {
        List<String> contacts = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            contacts.add("Contact " + i);
        }
        assertEquals(1000, contacts.size());
    }

    @Test
    void hashSetTreatsEqualObjectsAsDifferentByDefault() {
        Set<Contact> uniqueContacts = new HashSet<>();
        uniqueContacts.add(new Contact("Jacob", "091"));
        uniqueContacts.add(new Contact("Jacob", "091"));
        assertEquals(2, uniqueContacts.size());
    }
}
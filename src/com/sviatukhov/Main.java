package com.sviatukhov;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String[] arrayFirstName = new String[]{"Dmitriy", "Ivan", "Alex"};
        String[] arrayLastName = new String[]{"Ivanov", "Petrov", "Sidorov"};

        for (int i = 0; i < 100; i++) {
            int n = (int) Math.floor(Math.random() * arrayFirstName.length);
            int m = (int) Math.floor(Math.random() * arrayLastName.length);
            int age = (int) (20 + Math.random() * 60);
            int weight = (int) (40 + Math.random() * 100);
            int height = (int) (150 + Math.random() * 60);

            Person person = new Person(arrayFirstName[n], arrayLastName[m], age, weight, height);
            List<Person> persons = new ArrayList<>(100);
            persons.add(person);
            System.out.println(persons);
        }
    }
}

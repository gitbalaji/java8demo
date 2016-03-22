package com.dish;

import com.dish.model.Gender;
import com.dish.model.Person;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

public class MethodReferencesDemo {

    public static void main(String[] args) {

        List<Person> list = asList(
            new Person("Sara", Gender.FEMALE, 20),
            new Person("Sara", Gender.FEMALE, 22),
            new Person("Bob", Gender.MALE, 20),
            new Person("Paula", Gender.FEMALE, 32),
            new Person("Paul", Gender.MALE, 32),
            new Person("Jack", Gender.MALE, 2),
            new Person("Jack", Gender.MALE, 72),
            new Person("Jill", Gender.FEMALE, 12)
        );

        list.stream().map((person) -> person.getName()).collect(toList());

        list.stream().map(Person::getName).collect(toList());

    }


}

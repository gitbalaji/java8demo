package com.dish;

import com.dish.model.Gender;
import com.dish.model.Person;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class FilterDemo {

    public static void main(String[] args) {
        List<Person> persons = asList(
            new Person("Chen", Gender.MALE, 18)
            , new Person("Long Cui", Gender.MALE, 17)
            , new Person("Austin", Gender.MALE, 19)
            , new Person("Balaji", Gender.MALE, 25)
            , new Person("Sri", Gender.MALE, 35)
            , new Person("Andy", Gender.MALE, 55)
            , new Person("Travis", Gender.MALE, 45));

        List<Person> teens = persons.stream()
            .filter(person -> person.getAge() >= 13 && person.getAge() <= 19)
            .collect(Collectors.toList());

        System.out.println(teens);


    }
}

package com.dish;

import com.dish.model.Gender;
import com.dish.model.Person;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

public class MapDemo {

    public static void main(String[] args) {

        List<Person> persons = asList(
            new Person("Balaji", Gender.MALE, 25)
            , new Person("Sri", Gender.MALE, 35)
            , new Person("Andy", Gender.MALE, 55)
            , new Person("Travis", Gender.MALE, 45));

        List<String> listOfNames = persons.stream().map(person -> person.getName()).collect(toList());

        System.out.println(listOfNames);
    }
}

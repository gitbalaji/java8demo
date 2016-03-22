package com.dish;

import com.dish.model.Gender;
import com.dish.model.Person;

import java.util.*;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

public class SortingDemo {

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

//        Collections.sort(list, Comparator.comparing(Person::getAge));
//
//        System.out.println(list);


        System.out.println(list.stream().sorted(Comparator.comparing(Person::getAge)).collect(toList()));

        System.out.println(list);
    }
}

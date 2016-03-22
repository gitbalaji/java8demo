package com.dish;

import com.dish.model.Gender;
import com.dish.model.Person;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

public class HigherOrderFunction {

    public static void main(String[] args) {

        System.out.println(filterNumbers(asList(12, 20, 30, 5, 6, 8, 9), elem -> elem % 2 == 0));

        System.out.println(filterNumbers(asList(12, 20, 30, 5, 6, 8, 9), elem -> elem > 10 ));

        System.out.println(getConverter("json").apply(new Person("Balaji", Gender.MALE, 25)));
    }

    static List<Integer> filterNumbers(List<Integer> list, Predicate<Integer> filter) {
        return list.stream().filter(filter).collect(toList());
    }


    static Function<Person, String> getConverter(String type) {
        switch (type) {
            case "json":
                return (person) -> person.toString();
            case "xml":
                return (person) -> person.toString();
        }

        return (person) -> person.toString();
    }
}

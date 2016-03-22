package com.dish;

import java.util.List;
import java.util.function.Predicate;

import static java.util.Arrays.asList;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<String> isValidProvider = (provider) -> {

            List<String> list = asList("hughes", "viasat", "embarq");

            return list.contains(provider);
        };

        System.out.println(isValidProvider.test("embarq"));
    }
}

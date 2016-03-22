package com.dish;

import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {

        Function<String, String> toUpper = s -> s.toUpperCase();

        System.out.println(toUpper.apply("Balaji"));

    }
}

package com.dish;

import java.util.List;

import static java.util.Arrays.asList;

public class LambdaIntro {

    public static void main(String[] args) {

        List<String> list = asList("Balaji", "Radha", "Achu", "Avy");

        list.forEach(data -> System.out.println(data));

        //Anonymous Function
        //Has zero or more input
        //Returns zero or more output

    }
}

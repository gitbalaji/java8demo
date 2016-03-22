package com.dish;

import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

public class StreamDemo {

    public static void main(String[] args) {

        List<String> providers = asList("Balaji", "Radha", "Achu", "Avy");

        Stream<String> stream = providers.stream();

        System.out.println(stream);

        System.out.println(providers.stream().count());

        System.out.println(stream.map(a -> a.length()).collect(toList()));

        System.out.println(providers.stream().map(a -> a.length()).collect(toList()));


    }
}

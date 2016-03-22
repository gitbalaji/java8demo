package com.dish;

import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {
        Consumer<String> printData = (data) -> System.out.println(data);

        printData.accept("Java  8 is cool");
    }
}

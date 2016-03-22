package com.dish;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {
        Supplier<Map> initMap = () -> new HashMap<>();

        System.out.println(initMap.get());
    }
}

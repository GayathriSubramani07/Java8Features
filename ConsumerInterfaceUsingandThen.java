package com.demo;


import java.util.function.Consumer;
public class ConsumerInterfaceUsingandThen {
    public static void main(String[] args) {
        Consumer<String> first = s -> System.out.println("First: " + s);
        Consumer<String> second = s -> System.out.println("Second: " + s.toUpperCase());

        // Chain consumers
        Consumer<String> combined = first.andThen(second);

        combined.accept("java");
    }
}


// output
// First: java
// Second: JAVA

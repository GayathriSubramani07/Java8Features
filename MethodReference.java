package com.demo;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {

        List<String> l = Arrays.asList("Gayathri", "Janani", "Mehili");

        /*
         * Using Lambda Expression (Before Method Reference)
         * -------------------------------------------------
         * Here, we are first fetching each element using forEach()
         * and then printing it using System.out.println().
         * 
         * Example:
         * l.forEach(i -> System.out.println(i));
         */

        /*
         * Using Method Reference (Java 8 Feature)
         * ---------------------------------------
         * Instead of writing a lambda expression like i -> System.out.println(i),
         * we can directly pass the method as a reference.
         * 
         * Syntax: ClassName::methodName
         * 
         * Here, System.out::println means:
         * "Use the println method of System.out for each element in the list".
         * 
         * This is a cleaner and more readable alternative to the lambda expression.
         */
        l.forEach(System.out::println); // Method Reference Example
    }
}

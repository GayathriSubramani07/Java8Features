package com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * StreamApiDemo.java
 * ------------------
 * This program demonstrates the Stream API introduced in Java 8.
 * Stream API allows functional-style operations on collections such as
 * filtering, mapping, and reducing, without modifying the original data.
 
 */

public class StreamApiDemo {

    public static void main(String[] args) {

        // Sample list
        List<Integer> nums = Arrays.asList(4, 5, 6, 7, 8, 9);

        /*
         * --------------------------------------------------------------------
         * 1. Creating a Stream
         * --------------------------------------------------------------------
         * The stream() method converts the list into a Stream.
         * Stream is not a data structure — it is a pipeline to process data.
         */
        Stream<Integer> data = nums.stream();
        System.out.println("Original Stream:");
        data.forEach(i -> System.out.println(i));

        /*
         * Note:
         * Once a stream is consumed (like after forEach()), it cannot be reused.
         * Attempting to reuse it will throw IllegalStateException.
         */

        /*
         * --------------------------------------------------------------------
         * 2. Stream Operations: filter(), map(), forEach()
         * --------------------------------------------------------------------
         * - filter(): keeps elements that match the condition (uses Predicate)
         * - map(): transforms each element (uses Function)
         * - forEach(): performs an action for each element (uses Consumer)
         */
        System.out.println("\nEven numbers multiplied by 2:");
        nums.stream()
            .filter(n -> n % 2 == 0)
            .map(n -> n * 2)
            .forEach(i -> System.out.println(i));

        /*
         * --------------------------------------------------------------------
         * 3. Using reduce()
         * --------------------------------------------------------------------
         * The reduce() method combines stream elements into a single result.
         * It takes an initial value and a BinaryOperator.
         */
        int sum = nums.stream()
                      .filter(n -> n % 2 == 0)
                      .map(n -> n * 2)
                      .reduce(0, (c, e) -> c + e);

        System.out.println("\nSum of even numbers * 2: " + sum);

        /*
         * --------------------------------------------------------------------
         * 4. Parallel Stream
         * --------------------------------------------------------------------
         * If the data set is large, we can use parallelStream() to enable
         * multi-threaded processing automatically.
         */
        System.out.println("\nParallel Stream Example:");
        nums.parallelStream()
            .map(n -> n * 2)
            .forEach(System.out::println);

        /*
         * Note:
         * parallelStream() may not maintain element order.
         */

        /*
         * --------------------------------------------------------------------
         * 5. Key Points
         * --------------------------------------------------------------------
         * - Streams don’t modify the original collection.
         * - Once consumed, a stream cannot be reused.
         * - Intermediate operations (filter, map) return a Stream.
         * - Terminal operations (forEach, collect, reduce) produce a result.
         * - Supports both sequential and parallel execution.
         */
    }
}

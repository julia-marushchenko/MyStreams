// Java program to create Stream, add elements to it and print them.

package com.mystreams;

import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating an empty stream.
        Stream<String> emptyStream = Stream.empty(); // avoid return null.

        // Printing elements to console.
        emptyStream.forEach(System.out::println);

        // Adding elements.
        emptyStream = Stream.of("A", "B", "C");

        // Printing elements to console.
        emptyStream.forEach(System.out::println);

    }
}
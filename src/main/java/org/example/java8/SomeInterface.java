package org.example.java8;

public interface SomeInterface {

//    before Java8
    void doWork(); // without body

    // after Java 8
    default void doWork1() {
        System.out.println("I am working");
    }

    static void doWork2() {
        System.out.println("I am working");
    }
}

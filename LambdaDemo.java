package com.demo;

// Functional interface with a single abstract method
interface A {
    void show();
}

/*
 * Earlier (before Java 8), to implement an interface method,
 * we had to create a separate class or use an anonymous inner class.
 * 
 * But if we are going to use the implementation only once,
 * creating a separate class is unnecessary.
 * 
 * To simplify such one-time implementations,
 * Java 8 introduced Lambda Expressions.
 */

// Example: Traditional approach (before Java 8)
/*
class Demos implements A {
    @Override
    public void show() {
        System.out.println("Hello");
    }
}
*/

public class LambdaDemo {
    public static void main(String[] args) {

        // Using Anonymous Inner Class (Before Java 8)
        /*
        A obj = new A() { // Anonymous inner class
            @Override
            public void show() {
                System.out.println("Hello");
            }
        };
        obj.show();
        */

        // Using Lambda Expression (Java 8 and later)
        A obj = () -> System.out.println("Hello");

        // Calling the method
        obj.show();
    }
}

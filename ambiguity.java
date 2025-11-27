package com.demo;

interface A {
    default void show() {
        System.out.println("Show from Interface A");
    }
}

interface B {
    default void show() {
        System.out.println("Show from Interface B");
    }
}

class Demo implements A, B {
    // Overriding show() to resolve the conflict
    @Override
    public void show() {
        System.out.println("Show from Demo class");
        // You can still call interface versions explicitly:
        A.super.show();  // calls show() of A
        B.super.show();  // calls show() of B
    }
}

public class Main {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.show();
    }
}



// Show from Demo class
// Show from Interface A
// Show from Interface B

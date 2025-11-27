package com.demo;

interface Demo {
    default void display() {
        System.out.println("Hii Welcome ");
    }
}

class Show implements Demo {
    void demo() {
        System.out.println("Inside the Show class");
    }
}

class DefaultMethod {
    public static void main(String[] args) {
        Show s = new Show();
        s.display();  // from interface (default method)
        s.demo();     // from class
    }
}


// Hii Welcome 
// Inside the Show class

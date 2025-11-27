package com.demo;

interface Demo {
    static void display() {
        System.out.println("Hii Welcome ");
    }
}

class Show implements Demo {
    void demo() {
        System.out.println("Inside the Show class");
    }
}

class StatictMethod {
    public static void main(String[] args) {
        Demo.display();  // ✅ correct way to call static method
    }
}

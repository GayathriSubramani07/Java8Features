package com.demo;

import java.util.function.Consumer;

public class ConsumerInterface {
	public static void main(String[] args) {
		
		Consumer<String> i=s->System.out.println("Hello ,"+s);
		i.accept("Gayathri");
	}

}


// accept() is called automatically when you pass the input "Gayathri".

// The consumer “consumes” the string and prints it.

// output
//   Hello, Gayathri

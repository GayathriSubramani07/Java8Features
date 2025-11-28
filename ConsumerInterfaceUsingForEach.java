package com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceUsingForEach {
	public static void main(String[] args) {
		
		List<Integer> i=Arrays.asList(1,2,3,4,5);
		
		Consumer<Integer> c=n->System.out.println(n * n);
		
		i.forEach(c);
	}

}


// output
// 1
// 4
// 9
// 16
// 25

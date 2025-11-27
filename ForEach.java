package com.demo;

import java.util.Arrays;
import java.util.List;

public class ForEach {
	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(1,2,3,4,5);

		//External loops


		//1.for loop 

		//		for(int i=0;i<l.size();i++)
		//		{
		//			System.out.println(l.get(i));
		//		}



		//2.foreach loop 
		
		

//		for(int a:l)
//		{
//			System.out.println(a);
//		}
		
		//Internal Loop - java 8
		
		l.forEach(i ->System.out.println(i));
	}

}


// o/p
// 1
// 2
// 3
// 4
// 5


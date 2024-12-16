package com.jit.thirdsem;

import java.util.List;
public class TypeInference {

	public static void main(String[] args) {
	
	var name ="John";
	var age = 30;
	System.out.println("Name: "+name+ "Age: "+age);
	var numbers = List.of(1, 2, 3, 4, 5);
	for (var number : numbers) {
	System.out.println(number + " ");
	}
	}

}

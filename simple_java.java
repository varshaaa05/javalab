package com.jit.thirdsem;

public class simple_java {
	public static void main(String[] args) {
		int a=13,b=15,c=10;
		if (a>b && a>c) {
			System.out.println("Greatest = "+a);
		}
		else if (b>a && b>c) {
			System.out.println("Greatest = "+b);
		}
		else {
			System.out.println("Greatest = "+c);
		}
	}
}

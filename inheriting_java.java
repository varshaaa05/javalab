package com.jit.thirdsem;

public class inheriting_java extends inherting2_java {
	int b = 20;
	static int y = 200;
	public static void test2() {
		System.out.println(" from static of inherting_java");
		
	}
	public static void main (String[] args) {
		System.out.println("From main");
		inheriting_java ob = new inheriting_java();
		ob.test1();
		System.out.println(ob.a);
		ob.test2();
		System.out.println(ob.b);
		System.out.println(ob.x);
		System.out.println(ob.y);
	}
}

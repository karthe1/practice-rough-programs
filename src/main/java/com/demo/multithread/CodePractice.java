package com.demo.multithread;

class Demo {
	
	private int a;
	private int b;
	private short abc;
	
	public Demo() {
		
	}
	
	Demo(int a, int b) {
		
		this.a = a;
		this.b = b;
		System.out.println( this.abc + " " + this.a + " " + this.b);
	}
}

class Demo1 extends Demo {
}

public class CodePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d = new Demo(10, 10);
		main(10);
	}
	
	public static void main(int a) {
		System.out.println(a + " " + "Overloaded method");
	}
	
}

class ExtendedClass extends CodePractice {
	
	public static void main(String[] args) {
		System.out.println("");
	}
	
	public static void main(int a) {
		System.out.println(a + " " + "Overloaded method");
	}
}

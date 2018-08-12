package com.demo.lambda;

/**
 * Demo class to see method referencing
 * @author Abhi
 *
 */
public class DmeoMethodRef {
	
	public static void saySomething(){
		System.out.println("Hi there, it's method referencing");
	}
	
	public void sayHi(){
		System.out.println("Hi,it's method ref using instance variable");
	}

}

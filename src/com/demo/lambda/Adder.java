package com.demo.lambda;

/**
 * Demo for method referencing with method overloading
 * @author Abhi
 *
 */
public class Adder {

	public static int add(int a, int b){
		return a+b;
	}
	
	public static double add(double a, int b){
		return a+b;
	}
	public static float add(float a, int b){
		return a+b;
	}
	public static float add(float a, float b){
		return a+b;
	}
}

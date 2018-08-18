package com.demo.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * Demo class to use lambda expressions with collection api
 * @author Abhi
 *
 */
public class DemoLambdaCollections {

	public static void main(String[] args) {
		List<Integer> x=new ArrayList<Integer>();
		x.add(1);
		x.add(2);
		x.add(3);
		x.add(4);
		x.add(5);
		x.add(6);
		//Print the elements of list using lambda expressions
		System.out.println("Print the elements of list using lambda expressions");
		x.forEach(a->System.out.println(a));
		//Print the elements of list using method references
		System.out.println("Print the elements of list using method references");
		x.forEach(System.out::println);
	}

}

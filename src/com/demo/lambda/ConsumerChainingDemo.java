package com.demo.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Demo class to perform consumer chaining
 * 
 * @author Abhi
 *
 */
public class ConsumerChainingDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		List<Integer> resultList = new ArrayList<Integer>();
		Consumer<Integer> c1 = list::add; // method reference
		Consumer<Integer> c2 = i -> System.out.println(i); // lambda expression
		/**
		 * the phenomenon is called as consumer chaining. andThen method first
		 * calls and perform the operation for c1 and the calls and performs the
		 * operation for c2.
		 */
		resultList.stream().forEach(c1.andThen(c2));
	}

}

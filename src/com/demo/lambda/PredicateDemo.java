/**
 * 
 */
package com.demo.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Demo class for Predicates in Java8
 * 
 * @author Abhi
 *
 */
public class PredicateDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(new Student("Abhirup", 23), new Student("Pratap", 24),
				new Student("Somraj", 22));
		/**
		 * Predicate is an functional interface having an abstract method as
		 * test that takes a parameter and returns boolean values based on the
		 * condition.
		 */
		Predicate<Student> p1 = s -> s.getAge() >= 23;
		/**
		 * we can filter any list as per the test performed by the predicate.
		 * Stream is a typed interface Stream<T>. T can be anything like
		 * Integer, String, Object etc. Streams are helpful in processing large
		 * amount of data efficiently i.e. all the data the processed parallely
		 * and all the processes are pipelined. Stream can be used to perform
		 * operations on i.e. map/filter/reduce. Stream does not contain data in
		 * it. It should not change the data it processes. It should process the
		 * data in one pass
		 */
		List<Student> filteredList = studentList.stream().filter(p1).collect(Collectors.toList());
		filteredList.forEach(s -> {
			System.out.println(s.toString());
		});
	}

}

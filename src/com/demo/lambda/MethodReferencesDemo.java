package com.demo.lambda;

import java.util.function.BiFunction;
import java.util.function.Consumer;

/**
 * Demo class to show how method references in Java 8 works
 * 
 * @author Abhi
 *
 */
public class MethodReferencesDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Normal way of writing lambda expressions without method references.
		 */
		Consumer<String> c = s -> System.out.println(s);
		System.out.println(c);

		/**
		 * This is a new way of writing lambda expressions called as method
		 * references. We can use both static and non-static methods with this
		 * syntax.
		 */
		Consumer<String> c1 = System.out::println;
		System.out.println(c1);

		/**
		 * Syntax of method referencing: ContainingClass::method Demo to refer
		 * to static methods of class
		 */
		DemoMethodInterface demo = DmeoMethodRef::saySomething;
		demo.say();

		/**
		 * Demo of method referencing with method overloading using predefined
		 * functional interface.
		 */

		BiFunction<Integer, Integer, Integer> adder1 = Adder::add;
		BiFunction<Integer, Float, Float> adder2 = Adder::add;
		BiFunction<Float, Float, Float> adder3 = Adder::add;

		System.out.println(adder1.apply(2, 3));
		System.out.println(adder2.apply(2, 4.0f));
		System.out.println(adder3.apply(12.5f, 4.9f));

		/**
		 * Method referencing using instance variable
		 *
		 */

		DmeoMethodRef ref = new DmeoMethodRef();
		DemoMethodInterface demo2 = ref::sayHi;
		demo2.say();
		
		/**
		 * Reference to constructor 
		 * Syntax: ContainingClass::new
		 */
		
		MessageInterface message=Message::new;
		message.getMessage();
	}

}

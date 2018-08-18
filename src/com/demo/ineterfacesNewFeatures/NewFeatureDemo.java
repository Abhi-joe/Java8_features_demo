package com.demo.ineterfacesNewFeatures;

/**
 * Demo to show the new features of Java8 for interfaces
 * 
 * @author Abhi
 *
 */
public interface NewFeatureDemo {

	/**
	 * Till now as per Java7 we can only have public abstract methods and static
	 * final fields inside Interfaces.
	 */
	public static final String var = "Hello world";

	void sayHello();

	void sayBye();

	/**
	 * As per java 8 we can now have default methods with implementation and
	 * static methods with implementation inside interfaces
	 */
	default void sayHi() {
		System.out.println("Hi there, it's a new feature of java8");
	}

	public static void sayTata() {
		System.out.println("That's too a new feature of Java 8. Tata!");
	}

}

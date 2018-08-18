/**
 * 
 */
package com.demo.ineterfacesNewFeatures;

/**
 * @author Abhi
 *
 */
public class DemoTester implements NewFeatureDemo {

	/* (non-Javadoc)
	 * @see com.demo.ineterfacesNewFeatures.NewFeatureDemo#sayHello()
	 */
	@Override
	public void sayHello() {
		System.out.println("Hello");
	}

	/* (non-Javadoc)
	 * @see com.demo.ineterfacesNewFeatures.NewFeatureDemo#sayBye()
	 */
	@Override
	public void sayBye() {
		System.out.println("Bye");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NewFeatureDemo.sayTata();
		System.out.println(NewFeatureDemo.var);
	}

}

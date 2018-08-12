package com.demo.lambda;

import java.io.File;
import java.io.FileFilter;

/**
 * Simple demo class for lambda expression
 * 
 * @author Abhi
 *
 */
public class FirstLambdaExpression{

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/**
		 * The older way to use anonymous classes implementation before Java 8
		 */

		FileFilter filter = new FileFilter() {

			@Override
			public boolean accept(File pathname) {
				return pathname.getName().endsWith(".java");
			}
		};

		File dir = new File("E:/Learning/LearningWorkspace/DesignPatternsDemo/src/com/designpatterns/demo/builder");

		File[] fileList = dir.listFiles(filter);

		if (fileList.length != 0) {
			for (File file : fileList) {
				System.out.println(file);
			}
		} else {
			System.out.println("No files found");
		}

		/**
		 * Same fileFilter using lambda expressions in Java 8. Lambda
		 * expressions are a simpler way or an alternative of anonymous class
		 * implementation. Lambda expressions make the code more readable and
		 * writable
		 * 
		 */

		/**
		 * Note: 1) Lambda expression is of type functional interface(interfaces
		 * with only one abstract method). 2) Lambda expressions can be put in a
		 * variable. 3) Lambda expression is not an object as it doesn't use the
		 * new operator as in case of anonymous classes but it is recorded in
		 * JVM as an object without its own identity.
		 */
		System.out.println("Using Lambda expressions");
		FileFilter filterLambda = (File file) -> {
			return file.getName().endsWith(".java");
		};

		File lambdaDir = new File(
				"E:/Learning/LearningWorkspace/DesignPatternsDemo/src/com/designpatterns/demo/singleton");

		File[] dirList = lambdaDir.listFiles(filterLambda);

		if (dirList.length != 0) {
			for (File f : dirList) {
				System.out.println(f);
			}
		} else {
			System.out.println("No files found");
		}
		
		IDemoInterface demo = (a,b)->a+b;
		System.out.println(demo);
	}
}

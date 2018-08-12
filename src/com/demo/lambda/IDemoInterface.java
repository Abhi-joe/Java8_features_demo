package com.demo.lambda;

/**
 * Demo functional interface for lambda expression
 * @author Abhi
 *
 */
@FunctionalInterface
public interface IDemoInterface {

	/**
	 * Demo interface public abstract method 
	 * @param a :{@link Integer}
	 * @param b	: {@link Integer}
	 * @return : {@link Integer}
	 */
	public Integer getSum(int a, int b);
}

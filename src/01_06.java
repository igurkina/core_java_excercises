import java.math.BigInteger;

/*
 * Write a program that computes the factorial n! = 1*2*...*n, using BigInteger.
 * Compute the factorial of 1000.
 * 
 * Author: igurkina
 */

class BigInt_Factorial {
	public static void main(String[] args) {
		BigInteger fact = BigInteger.valueOf(1);
		for (int i = 1; i <= 1000; i++) {
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		
		System.out.println("BigInteger 1000! is: " + fact);
	}
}
import java.util.Random;

/*
 * Write a program that produces a random string of letters and digits by generating a random long value and printing it in base 36.
 * 
 * Author: igurkina
 * 
 */

class Random_Long {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		long randLong = rnd.nextLong();
		
		String encodedLong = Long.toString(randLong,36);
		
		System.out.println("Random long with base 36 is:" + encodedLong);
	}
}
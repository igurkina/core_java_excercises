import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;

/*
 * Write a program that prints a lottery combination, picking six distinct numbers between 1 and 49. To pick six distinct numbers, start with an array list filled with 1 ... 49. Pick a random index and remove the element. Repeat six times. Print the result in sorted order.
 * 
 * Author: igurkina
*/

class Lottery {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();		
		ArrayList<Integer> combination = new ArrayList<>();
		
		for (int i = 1; i <=49; i++) {
			numbers.add(i);
		}
		
		Random rnd = new Random();
		
		for (int i = 0; i<6; i++) {
			int randIndex = rnd.nextInt(numbers.size());
			combination.add(numbers.get(randIndex));
			numbers.remove(randIndex);
		}
		Collections.sort(combination);
		System.out.println(combination.toString());
	}
}
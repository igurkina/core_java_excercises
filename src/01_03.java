import java.util.Scanner;

/*
 * Using only the conditional operator, write a program that reads three integersand prints the largest.
 * Repeat with Math.max.
 */

class Max_Integer {
	
	public static void main (String[] args) {
		System.out.println("Enter 3 integer numbers: ");
		
		Scanner in = new Scanner(System.in);
		int firstNum = in.nextInt();
		int secondNum = in.nextInt();
		int thirdNum = in.nextInt();
		in.close();
		
		int maxNum = firstNum;
		
		if (secondNum > maxNum) {
			maxNum = secondNum;
		}
		if (thirdNum > maxNum) {
			maxNum = thirdNum;
		}
		
		System.out.println("Max number is: " + maxNum);
		
		int maxNumMath = Math.max(Math.max(firstNum, secondNum), thirdNum);
		System.out.println("Max number found via Math.max: " + maxNumMath);
	}
}
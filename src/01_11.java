import java.util.Scanner;

/*
 * Write a program that reads a line of text and prints all characters that are not ASCII, together with their Unicode values.
 * 
 * Author: igurkina
 * 
 */

class ASCII_Chars {
	
	public static void main(String[] args) {
		
		System.out.println("Enter any line of text: ");
		
		Scanner in = new Scanner(System.in);
		String inputString = in.nextLine();
		in.close();
		
		String nonASCII = inputString.replaceAll("[\\p{ASCII}]", "");
		
		for (int i = 0; i < nonASCII.length()-1; i++) {
			System.out.println(nonASCII.substring(i, i+1) + " --- " + nonASCII.codePointAt(i));
		}
	}
}
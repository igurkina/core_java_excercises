import java.util.Scanner;

/*
 * Write a program that reads  string and prints all of its nonempty substrings.
 * 
 * Author: igurkina
 * 
 */

class String_Split {
	
	public static void main(String[] args) {
		System.out.println("Enter any string: ");
		
		Scanner in = new Scanner(System.in);
		String inputString = in.nextLine();
		in.close();
		
		int length = inputString.length();
		String sub;
		
		System.out.println("Substrings of \"" + inputString + "\" are: ");
		
		for (int i = 0; i < length; i++) {
			for (int j = 1; j <= length-i; j++) {
				sub = inputString.substring(i,i+j);
				if (sub != null && !sub.isEmpty()) {
					System.out.println("\""+ sub + "\"");
				}			
			}
		}
	}
}
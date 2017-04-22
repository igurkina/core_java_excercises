import java.util.Scanner;

/* 
 * Write a program that reads an integer and prints it in binary, octal and hexadecimal.
 * Print the reciprocal as a hexadecimal floating-point number.
 */

class Int_Conversion {
	
	public static void main(String[] args) {
		System.out.print("Please, enter any integer number:");
		
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		in.close();
		
		System.out.printf("\nBinary: %s", Integer.toString(num,2));
		System.out.printf("\nOctal: %s", Integer.toString(num,8));
		System.out.printf("\nHex: %s", Integer.toString(num,16));
	}
}
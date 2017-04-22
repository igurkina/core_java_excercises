import java.util.Scanner;

/*
 * Write a program that reads an integer angle (which may be positive or negative) and normalizes it to a value between 0 and 359 degrees.
 */

class Normalized_Angle {
	
	public static void main(String[] args) {
		System.out.println("Please, enter any integer number:");
		
		Scanner in = new Scanner(System.in);
		int intAngle = in.nextInt();
		in.close();
		
		int normAngle = (intAngle %= 360) >= 0 ? intAngle : (intAngle + 360);
		int normAngleFloor = (Math.floorMod(intAngle, 360)) >= 0 ? intAngle : (intAngle + 360);
		
		System.out.println("Normalized Angle: " + normAngle);
		System.out.println("FloorMod Normalized Angle: " + normAngleFloor);
	}
}
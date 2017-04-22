/*
 * What happens when you cast a double to an int that is larger than the largest possible int value?
 */

class Max_Int {
	public static void main(String [] args) {
		Double maxDouble = Double.MAX_VALUE;
		Integer maxInt = Integer.MAX_VALUE;
		// Program is terminated during next step as maxDouble is larger, than maxInt (64 bit vs 32 bit)
		//Integer castedDouble = maxDouble.intValue();
		System.out.print(maxDouble > maxInt);
	}
}
package de.itgene.Assertions;

public class Assertions {

	public static void main(String args[]) {
		runAssertionsTest01(5);
		System.out.println("Program finished.");
	}

	private static void runAssertionsTest01(int x) {
		if (x > 10) {
			System.out.println("Valid program behaviour!");
		} else {
			assert false : "This should never be reached!";
		}

	}
}

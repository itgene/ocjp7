package de.itgene.Assertions;

public class Assertions {

	public static void main(String args[]) {
		//
		Assertions assertionsTests = new Assertions();
		assertionsTests.runAssertionsTest01(15);
		assertionsTests.runAssertionsTest02();
		//
		System.out.println("Assertion Tests finished.");
	}

	private void runAssertionsTest01(int x) {
		if (x > 10) {
			System.out.println("Valid program behaviour!");
		} else {
			assert false : "This should never be reached!";
		}
	}

	private void runAssertionsTest02() {
		System.out.println("Test valid assertions ...");
		boolean b = true;
		int i = 10;
		//
		assert b;
		assert (b);
		assert (i == 10);
		assert b : "b is not true";
		assert (i == 10) : "Current value of i " + i + " is not 10!";
		assert b : methodWithReturn();
		assert (i == 10) : new String("New String");
		assert b = false; // Valid, but not recommended!!
		//
		// Invalid assertions ...
		// assert i;
		// assert i=1;
		// assert b=true;
		// assert b: methodWithNoReturn();
	}

	private String methodWithReturn() {
		return "Result of methodWithReturn()";
	}

	private void methodWithNoReturn() {
		// do something
	}
}

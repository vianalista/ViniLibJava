package com.blogspot.viminas;

/**
 * Test for call compiler error messages.
 * */
public class KnownErrorMessages {
	protected KnownErrorMessages() {

	}

	/**
	 * Known error messages to different types.
	 * */
	public void ErrorMsgDivide() {

		int num = 10;

		// num = 5
		num = num / 2;
		System.out.println("num = " + num);

		/**
		 * Exception in thread "main" java.lang.ArithmeticException: / by zero
		 */
		num = num / 0;
		System.out.println("num = " + num);

		/**
		 * num = num / 0.0; Type mismatch: cannot convert from double to int.
		 * Sugestion: Use cast.
		 * */
		num = (int) (num / 0.0);
		System.out.println("num = " + num);
	}
}

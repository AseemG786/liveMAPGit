package com.demo.exception;
// IP handle NullPointerException too.
public class SingleCatch_MultipleExceptionEx {
	public static void main(String[] args) {
		System.err.println("do");
		int result = 0, num1, num2;
		num1 = 1000;
		num2 = 200;
//		num2 = 0;
		String subjectString [] = {"oops","exception hanlding", "collections"};
		try {
			result = num1 / num2;
			System.err.println("not here!");
			for(int i = 0; i<=subjectString.length; i++)
				System.err.println(subjectString[i]);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException exception) {
			String messageString = exception.getMessage();
			System.err.println("No / 0 or invalid index " + messageString);
		}
		System.err.println(result);
		System.err.println("done");		
	}
}

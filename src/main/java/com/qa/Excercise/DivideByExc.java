package com.qa.Excercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByExc {
	
	Scanner scanMe = new Scanner(System.in);
	
	public void divide() {
		try {
//			that can take two ints as input from the user and can produce the division of these numbers
		int numOne = scanMe.nextInt();
		int numTwo = scanMe.nextInt();
		
//		own bespoke exception will be thrown if the user tries to divide a number (a) by a larger number (b).
		if (numTwo > numOne) {
			throw new DivideByException();
		}
		System.out.println(numOne / numTwo);
//		 need to catch two specific exceptions as well as an overall third exception.
	}catch (InputMismatchException ime) {
		System.out.println("Input must be a number");
	}catch (ArithmeticException ae) {
		System.out.println(ae.getMessage());
	}catch (Exception e) {
		e.printStackTrace();
	} finally {
		scanMe.close();
	}
		

}
}
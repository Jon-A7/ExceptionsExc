package com.Exceptions.jonathan;

public class Division {
	
	public void divide(int a, int b) throws UnsupportedDataTypeException, ArithmeticException, IntegerTooLargeException{
		int result;
		
		if(a < b){
			IntegerTooLargeException ie = new IntegerTooLargeException();
			throw ie;
			
		}
		
		
		result = a / b;
		System.out.println("Your answer is: " + result);
	}

}

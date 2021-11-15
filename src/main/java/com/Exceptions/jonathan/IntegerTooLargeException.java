package com.Exceptions.jonathan;

public class IntegerTooLargeException extends Exception{
	public void message() {
		System.out.println("integer 'b' cannot be larger than integer 'a'. Please enter valid integers.");
	}

}

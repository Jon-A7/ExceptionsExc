package com.Exceptions.jonathan;

public class Runner {
	public static void main(String[]args) {
		
		try {
			Division d1 = new Division();
			d1.divide(5, 10);
			
		}catch(IntegerTooLargeException ie) {
			ie.message();
			ie.printStackTrace();
			
			
		}
		catch(UnsupportedDataTypeException u){
			u.printStackTrace();
			
		}
//		catch(ArithmeticException a) {
//			a.printStackTrace();
//		}catch(Exception e) {
//			
//		}
	}
}

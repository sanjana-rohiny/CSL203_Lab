package Lab6;

public class ExceptionTest {

	public static int divTest3(int num, int den) {
		
		System.out.println("divTest3() num1 = " + num + " den = " + den);			

		int result  = 0;
		
		if (den == 0) {
			throw new ArithmeticException("Zero Division Error...!"); 
		}
		
		result = num/den;
		return result;
	}
	
	public static int divTest2(int num, int den) throws ArithmeticException {
		
		System.out.println("divTest2() num1 = " + num + " den = " + den);			

		int result  = 0;
		result = num/den;
		return result;
	}

	public static int divTest1(int num, int den) {
		
		int result  = 0;
		System.out.println("divTest1() num1 = " + num + " den = " + den);			

		try {
			result = num/den;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Program ends...!");			
		}
		return result;
	}
	
	public static void main(String[] args) {

		int result;
		
		// test divTest1 ...! try-catch-finally
		result = divTest1(10,0);
		
		// test divTest2 ...! throws exception
		try {
			result = divTest2(10,0);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} 

		// test divTest3 ...! throw exception
		try {
			result = divTest3(10,0);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} 
	}

}

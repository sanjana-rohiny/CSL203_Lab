package Lab1;

import java.util.Scanner;

public class Frequency {

	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a String :");
		String string = scanner.next();
		
		System.out.print("Enter a char :");
		char ch = scanner.next().charAt(0);

		int count = 0;
		for (int i=0; i<string.length(); i++) {
			
			if (string.charAt(i) == ch ) {
				count += 1;
			}
		}
		scanner.close();
		System.out.print("Number of occurance of " + ch + "  = " + count);
	}
}

package Lab4;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a String :");
		String str = scanner.nextLine();
		
		System.out.println("Entered String :" + str);
		
		StringTokenizer strTok = new StringTokenizer(str);
		
		System.out.println("No of Tokens " + strTok.countTokens());
		
		System.out.println("Tokens");
			
		int sum = 0;
		while (strTok.hasMoreTokens()) {
			
			try {
			sum += Integer.parseInt(strTok.nextToken());
			} catch(NumberFormatException e) {
				System.out.println(e.getMessage());						
			}
		}		
		
		
		
		System.out.println("Sum of Tokens " + sum);

	}
}

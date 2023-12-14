package Lab1;

import java.util.Scanner;

public class Palindrome {

	static void checkPalindrome2(String string) {
		
		boolean flag = true;
		for (int i=0; i<string.length()/2; i++) {
			
			if (string.charAt(i) != string.charAt(string.length() - 1 -i ) ) {
				System.out.println(string + "is Not a palindrome...!");
				flag = false;
				break;
			}
		}
		
		if (flag == true) {
			System.out.println(string + " is a palindrome...!");			
		}
	}
	
	static void checkPalindrome1(String string) {
		
		boolean flag = true;
		for (int i=0; i<string.length()/2; i++) {
			
			if (string.charAt(i) != string.charAt(string.length() - 1 -i ) ) {
				System.out.println(string + "is Not a palindrome...!");
				flag = false;
				break;
			}
		}
		
		if (flag == true) {
			System.out.println(string + " is a palindrome...!");			
		}
	}
	
	static void checkPalindrome(char[] string) {

		boolean flag = true;
		for (int i = 0; i < string.length / 2; i++) {

			if (string[i] != string[string.length - 1 - i]) {
				System.out.println(string + "is Not a palindrome...!");
				flag = false;
				break;
			}
		}

		if (flag == true) {
			System.out.println(string + " is a palindrome...!");
		}
	}

	public static void main(String[] args) {
		
		char str[] = {'m','a', 'l', 'a','y', 'a', 'l', 'a', 'm'};
		checkPalindrome(str);
		checkPalindrome1("malayalam");
		
		
		System.out.print("Enter string = ");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		
		System.out.println("input string = " + string);
		checkPalindrome1(string);

	}
}

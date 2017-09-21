package control.statements;

import java.util.Scanner;

public class PalindromeNumberTester {

	public static void main(String[] args) {
		PalindromeNumber palindromeNumber = new PalindromeNumber();

		// Asking the user to enter an Integer.
		System.out.println("Please Enter a number(with in Integer range) : ");

		Scanner scanner = new Scanner(System.in);

		int palindrome = scanner.nextInt();

		// Checking if the isPalindrome method returns true or false.
		if (palindromeNumber.isPalindrome(palindrome)) {
			System.out.println("Number : " + palindrome + " is a palindrome");

		} else {
			System.out.println("Number : " + palindrome + " is not a palindrome");
		}

		scanner.close();
	}

}

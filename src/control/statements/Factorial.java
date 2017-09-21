package control.statements;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		System.out.println("Please Enter a number(Result must be in Integer range) : ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int factorial = 1;
		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;
		}
		System.out.println("The factorial of Number is " + factorial);
		scanner.close();
	}
	
}
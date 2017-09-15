package control.statements;

import java.util.Scanner;

public class DayOfWeek {
	public static void main(String[] args) {
        int a;
        String name = " ";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Numeric day(1-7): ");
        a =sc.nextInt();
        
        switch (a) {
            case 1: name ="Monday";
                    break;
            case 2: name ="Tuesday";
                    break;
            case 3: name ="Wednesday";
                    break;
            case 4: name ="Thursday";
                    break;
            case 5: name ="Friday";
                    break;
            case 6: name ="Saturday";
                    break;
            case 7: name ="Sunday";
                    break;
            default: name = "Unknown Day";
                     break;
        }
        
        System.out.println("Your Entered Day is: " + name);
        sc.close();
	}
}

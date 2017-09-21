package control.statements;

public class PalindromeNumber {
	
    public boolean isPalindrome(int number) {
        int palindrome = number; // copied number into variable
        
        int reverse = 0; 
        
        while (palindrome != 0) { //check the condition until zero
            int remainder = palindrome % 10;//calculate the reminder from '0' position to 10,100 so on
            reverse = reverse * 10 + remainder;//reversing the number
            palindrome = palindrome / 10;
        }
        
        if (number == reverse) {//comparing the two numbers i.e given and reverse numbers
            return true;
        }
        
        return false;
    }
}

package dsa_questions;
import java.util.*;

public class PalindromeCheck {

	public static void main(String[] args) {

		String str;
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER A STRING : ");
        str = in.nextLine();
		
        String lower = str.toLowerCase();
        int left = 0, right = lower.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (lower.charAt(left) != lower.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println(str + " is a Palindrome.");
        } else {
            System.out.println(str + " is NOT a Palindrome.");
        }
        
        in.close();
	}

}

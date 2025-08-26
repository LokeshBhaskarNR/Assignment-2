package dsa_questions;
import java.util.*;

public class CountVowels {

	public static void main(String[] args) {

        String str;
        
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER A STRING : ");
        str = in.nextLine();
        
        int count = 0;
        String vowels = "aeiouAEIOU";

        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }

        System.out.println("String : " + str);
        System.out.println("Number of vowels : " + count);

        in.close();
	}

}

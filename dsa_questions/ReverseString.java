package dsa_questions;
import java.util.*;

public class ReverseString {

	public static void main(String[] args) {

        String str;
        String reversed = "";
        
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER A STRING ");
        str = in.nextLine();

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversed);
        
        in.close();

	}

}

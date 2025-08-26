package dsa_questions;
import java.util.*;

public class DistinctCharacters {

	public static void main(String[] args) {

		String str;
        Set<Character> set = new LinkedHashSet<>();
        
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER A STRING ");
        str = in.nextLine();

        for (char letter : str.toCharArray()) {
            set.add(letter);
        }

        System.out.println("Distinct characters in \"" + str + "\": " + set);
        
        in.close();
	}

}

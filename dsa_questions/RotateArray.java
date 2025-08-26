package dsa_questions;
import java.util.*;

public class RotateArray {

	public static void main(String[] args) {

        
        int m; 
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("ENTER THE SIZE OF ARRAY : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the array : ");
        for(int index=0; index < n; index ++ ) {
        	arr[index] = in.nextInt();
        }
        
        System.out.println("Enter the rotation index : m");
        m = in.nextInt();

        m = m % n; 
        int[] rotated = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[i] = arr[(i + m) % n];
        }

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Array after rotating left by " + m + " positions: " + Arrays.toString(rotated));

        in.close();
	}

}

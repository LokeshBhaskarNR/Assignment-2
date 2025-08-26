package dsa_questions;
import java.util.*;

public class LargestInArray {

	public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        
        int max = arr[0];

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Array elements: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\nLargest number: " + max);
        
        in.close();

	}

}


import java.util.Arrays;

public class SortedArray {
     public static void main(String[] args) {

        // Declare and initialize the array
        int[] arr = {45, 12, 78, 34, 23};

        // Sort the array
        Arrays.sort(arr);

        // Display the sorted array
        System.out.println("Sorted Array (Ascending Order):");

        for (int num : arr) {
            System.out.print(num + " ");
        }


    }
    
}

import Challenges.ArrayUtility;
import java.util.Arrays;
import java.util.Scanner;

public class ArryAdds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Array Sum Program!");

        System.out.println("Enter first array:");
        int[] arr1 = ArrayUtility.intputArray();

        System.out.println("Enter second array:");
        int[] arr2 = ArrayUtility.intputArray();

        // Check for equal length
        if (arr1.length != arr2.length) {
            System.out.println("Error: Both arrays must have the same length!");
            return;

        }

        // Create result array
        int[] adds = new int[arr1.length];

        // Add elements of the
        for (int i = 0; i < arr1.length; i++) {
            adds[i] = arr1[i] + arr2[i];
        }

        // Display sum
        System.out.println("Sum of both arrays:");
        System.out.println(Arrays.toString(adds));
    }
}

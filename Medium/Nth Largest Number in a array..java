import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NthLargest {
    public static int findNthLargest(int[] arr, int n) {
        Arrays.sort(arr); 
        return arr[arr.length - n]; 
    }

    public static void main(String[] args) {
        int[] arr = {14, 67, 48, 23, 5, 62};
        Scanner s = new Scanner(System.in);
        
        try {
            System.out.print("Enter the value of N: ");
            int n = s.nextInt();
            
            if (n <= 0 || n > arr.length) {
                System.out.println("N must be between 1 and " + arr.length);
            } else {
                int nthLargest = findNthLargest(arr, n);
                System.out.println(n + "th Largest number: " + nthLargest);
            }
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid integer for N.");
        } finally {
            s.close();
        }
    }
}

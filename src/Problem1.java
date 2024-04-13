import java.util.Scanner;
import java.util.Arrays;
public class Problem1 {


    public static int fMin(int[] A, int n) { //The fMin method finds the minimum element of the array using recursion
        if (n == 1) { //If the size of the array is 1, it returns the same element.
            return A[0];
        }

        int rec = fMin(A, n - 1);

        return Math.min(rec, A[n - 1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();


        int[] A = new int[n]; //setting the size of the array

        for (int j = 0; j < n; j++) { //adding elements to an array
            A[j] = sc.nextInt();
        }
        double start = System.nanoTime();

        int minimum = fMin(A, n); //use method for find min element

        System.out.println("Minimum element is: " + minimum);


        double end = System.nanoTime();
        double duration = (end - start) / 1_000_000.0;
        System.out.println("Time taken: " + duration + " ms");
    }
}

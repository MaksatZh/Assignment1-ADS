import java.util.Scanner;
public class Problem9 {

    /**
     * Recursive method to calculate the binomial coefficient C(n, k).
     * n The total number of items.
     * k The number of items to choose.
     * return The binomial coefficient C(n, k).
     */
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) { // Base cases: C(n, 0) = C(n, n) = 1
            return 1;
        }

        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k); // Recursive C(n, k) = C(n-1, k-1) + C(n-1, k)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();// Read the total number of items
        int num2 = sc.nextInt();// Read the number of items to choose

        double start = System.nanoTime();


        int result = binomialCoefficient(num1, num2); // Calculate the binomial coefficient
        System.out.println("C(" + num1 + ", " + num2 + ") = " + result); //print result

        double end = System.nanoTime();
        double duration = (end - start) / 1_000_000.0;
        System.out.println("Time taken: " + duration + " ms");
    }



}

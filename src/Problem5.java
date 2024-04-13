import java.util.Scanner;

/**
 * Recursive method to calculate the Fibonacci number at position n.
 *  n The position in the Fibonacci sequence
 */
public class Problem5 {
    public static int fibonacci(int n) {
        // fibonacci(0) = 0, fibonacci(1) = 1
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        // Recursive fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        double start = System.nanoTime();

        int nElement = fibonacci(number); // Calculate Fibonacci number at position n
        System.out.println(nElement);

        double end = System.nanoTime();
        double duration = (end - start) / 1_000_000.0;
        System.out.println("Time taken: " + duration + " ms");

    }
}

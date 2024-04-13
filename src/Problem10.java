import java.util.Scanner;

public class Problem10 {

    /**
     * Recursive method to calculate the greatest common divisor (GCD) of two numbers.
     * a The first number.
     * b The second number.
     * return The GCD of a and b.
     */
    public static int gcd(int a, int b) {
        // Base case: If b is 0, then GCD(a, 0) = a
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b); // Recursive GCD(a, b) = GCD(b, a % b)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // Read the first number
        int b = sc.nextInt(); // Read the second number

        double start = System.nanoTime();

        int result = gcd(a, b); // Calculate the GCD
        System.out.println("GCD(" + a + ", " + b + ") = " + result); // print result

        double end = System.nanoTime();
        double duration = (end - start) / 1_000_000.0;
        System.out.println("Time taken: " + duration + " ms");
    }
}



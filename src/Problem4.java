import java.util.Scanner;

/**
 * Recursive method to calculate the factorial of a number.
 * n The number for which to calculate the factorial
 */


public class Problem4 {
    public static int factorial (int n){
        if(n == 1 || n == 0){ //factorial of 0 or 1 is 1
            return 1;
        }
        return (n * factorial(n-1));  // Recursive n * factorial(n-1)
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        double start = System.nanoTime();
        int f = factorial(number); // Calculate factorial

        System.out.println(f);
        double end = System.nanoTime();
        double duration = (end - start) / 1_000_000.0;
        System.out.println("Time taken: " + duration + " ms");
    }
}

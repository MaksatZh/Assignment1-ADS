import java.util.Scanner;

/**
 * Recursive method to calculate the power of a number.
 * a The base number
 * n The exponent
 * method power -> The result of a^n
 */


public class Problem6 {
    public static int power(int a, int n){
        if (n == 0) return 1; // Anything raised to the power of 0 is 1
        return a * power(a,n-1);// Recursive  a^n = a * a^(n-1)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();// Read the base number
        int stepen = sc.nextInt();// Read the exponent

        double start = System.nanoTime();


        int f = power(number, stepen); // Calculate the power
        System.out.println(f);

        double end = System.nanoTime();
        double duration = (end - start) / 1_000_000.0;
        System.out.println("Time taken: " + duration + " ms");
    }


}

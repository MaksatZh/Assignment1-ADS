import java.util.Scanner;
public class Problem3 {

    /**
     * Method to determine whether a number is prime or composite.
     * n The number to check
     * m The divisor to check for number n
     */
    public static String prime(int n, int m){
        if(n<=1){
            return "Composite"; // If the number is less than or equal to 1, consider it composite
        }
        if(n == m){
            return "Prime"; // If n is equal to m, then n is not divisible by any number from 2 to n-1, hence it's prime
        }
        if (n % m == 0) {
            return "Composite"; // If n is divisible by m, then it's composite
        }
        return prime(n,m+1); // Recursive call to check the next divisor
    }



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        double start = System.nanoTime();

        int m = 2; // Start checking divisors from 2
        System.out.println(prime(number,m));


        double end = System.nanoTime();
        double duration = (end - start) / 1_000_000.0;
        System.out.println("Time taken: " + duration + " ms");
    }
}

import java.util.Scanner;
/**
 * Recursive method to check if a string consists only of digits.
 * text The input string to check
 * return "YES" if the string consists only of digits, "NO" otherwise
 */


public class Problem8 {

    public static String digits(String text){

        if (text.isEmpty()) { //If the string is empty, it consists only of digits
            return "YES";
        }

        if (!Character.isDigit(text.charAt(0))) { // Check if the first character is not a digit
            return "NO";
        }

        return digits(text.substring(1));// Recursive call with the substring starting from the next character
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine(); // Read the input string

        double start = System.nanoTime();


        String res = digits(text); // Check if the string consists only of digits
        System.out.println(res);

        double end = System.nanoTime();
        double duration = (end - start) / 1_000_000.0;
        System.out.println("Time taken: " + duration + " ms");

    }
}

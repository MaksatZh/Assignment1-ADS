import java.util.Scanner;
public class Problem7 {
    /**
     * Recursive method to reverse and print an array.
     * size The index of the last element in the array
     * array The array to reverse
     */
    public static void reverse(int size, int[] array){
        if (size < 0){// If size is less than 0, return
            return;
        }
        System.out.print(array[size] + " ");  // Print the element at index 'size'
        reverse(size-1, array); // Recursive call with size-1 to move to the previous element
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();// Read the size of the array

        int[] array = new int[size];//set size array

        for(int i = 0; i < size; i++){ // Prompt user to enter elements of the array
            array[i] = sc.nextInt();
        }

        double start = System.nanoTime();

        reverse(size-1, array); // Reverse and print the array




        double end = System.nanoTime();
        double duration = (end - start) / 1_000_000.0;
        System.out.println("Time taken: " + duration + " ms");
    }


}

import java.util.Scanner;

public class Problem2 {

    public static double average(int[] a, int size){
        if (size==0) return 0;

        return  a[size-1] + average(a, size-1);


    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();


        int[] a = new int[size]; //setting the size of the array

        for (int j = 0; j < size; j++) { //adding elements to an array
            a[j] = sc.nextInt();
        }
        double start = System.nanoTime();

        double aver = average(a, size)/size; //use method and avarege formula
        System.out.println(aver);

        double end = System.nanoTime();
        double duration = (end - start) / 1_000_000.0;
        System.out.println("Time taken: " + duration + " ms");


    }


}

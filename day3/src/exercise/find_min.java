package exercise;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class find_min {
    public static void main(String[] args) {
        InputStream in = System.in;
        Scanner input = new Scanner(in);
        System.out.println("Enter size of array : ");
        int size = input.nextInt();
        int[] arr = new int[size];


        for (int x = 0; x < size; x++) {
            System.out.println("Enter the element " + x + " :");
            arr[x] = input.nextInt();
        }

        int min = arr[0];
        for (int x : arr) {
            if (x < min) {
                min = x;
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Min element is : " + min);

        input.close();
    }
}

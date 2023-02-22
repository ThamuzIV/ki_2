package exercise;

import java.io.InputStream;
import java.util.Scanner;

public class join {
    public static void main(String[] args) {
        InputStream in = System.in;
        Scanner input = new Scanner(in);

        int size;
        System.out.println("Enter size array 1 ");
        size = input.nextInt();
        String[] array1 = new String[size];

        for (int x = 0; x < size; x++) {
            System.out.print("Enter element " + x + " : ");
            array1[x] = input.next();
        }

        System.out.println("Enter size array 2 ");
        size = input.nextInt();
        String[] array2 = new String[size];

        for (int x = 0; x < size; x++) {
            System.out.print("Enter element " + x + " : ");
            array2[x] = input.next();
        }

        size = array1.length + array2.length;
        String[] bigArray = new String[size];

        for (int i = 0 ; i < bigArray.length; i++ ) {
            size = array1.length;
            if (i < size) {
                    bigArray[i] = array1[i];
            }else {
                    bigArray[i] = array2[i-size];
            }
        }

        for (String x : bigArray) {
            System.out.print(x + ",");
        }
    }
}

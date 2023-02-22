package practise;

import java.io.InputStream;
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        InputStream in = System.in;
        Scanner input = new Scanner(in);

        int size;
        String[] array, arrayRevert;

        do {
            System.out.print("Enter array size: ");
            size = input.nextInt();
            if(size > 20 || size < 1) {
                System.out.println("this size not support, please enter number (1-20)");
            }
        } while (size > 20);

        array = new String[size];
        arrayRevert = new String[size];

        for (int i = 1, x = array.length ; i <= x;i++ ){
            System.out.println("Enter element " + i + " (text)");
            String push = input.next();
            array[i-1] = push;
        }

        for (int x = 0,y = size - 1; y >= 0 ; x++,y--){
            arrayRevert[x] = array[y];
            System.out.print(arrayRevert[x] + " ");
        }

        input.close();

    }
}

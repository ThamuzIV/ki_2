package practise;

import java.io.InputStream;
import java.util.Scanner;

public class findMax {
    public static void main(String[] args) {
        InputStream in = System.in;
        Scanner input = new Scanner(in);

        System.out.println("Please enter the number of billionaires in the world ");
        int size = input.nextInt();

        boolean retype = true;

        while (retype) {
            if(size > 20 || size < 5) {
                System.out.println("Number to small or to big please retype");
                size = input.nextInt();
            }else {
                break;
            }
        }

        String[] name = new String[size];
        int[] asset = new int[size];
        int top1 = 0;

        System.out.println("is " + size);
        for (int i = 0,y = 1; i < size; i++,y++) {
            System.out.print("Enter name of billionaires " + y + " : ");
            name[i] = input.next();
            System.out.print("Enter their properties (billions dollars): ");
            asset[i] = input.nextInt();

            if (asset[i] > top1) {
                top1 = i;
            }
        }

        System.out.println();

        System.out.println("The person with the largest wealth is: " + name[top1] + " with " + asset[top1] + "billions $");
        System.out.println("and they is " + top1 + " in the list");

        input.close();

    }
}

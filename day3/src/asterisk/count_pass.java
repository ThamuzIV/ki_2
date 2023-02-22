package asterisk;

import java.io.InputStream;
import java.util.Scanner;

public class count_pass {
    public static void main(String[] args) {
        InputStream in = System.in;
        Scanner input = new Scanner(in);

        System.out.println("Enter number of student: ");
        int size = input.nextInt();
        int[] pass = new int[size];
        String[] name = new String[size];
        float[] scores = new float[size];
        int count = 0;

        for (int i = 0, j = 0; i < size; i++) {
            System.out.print("Enter name student " + i + " and scores: ");
            name[i] = input.next();
            System.out.print("");
            scores[i] = input.nextFloat();

            if (scores[i] >= 5) {
                pass[j] = i;
                count++;
                j++;
            }
        }

        System.out.println("Have " + count + " student pass: ");
        for (int i : pass) {
            if (scores[i] < 5) {
                break;
            }
            System.out.println("name: " + name[i] + " and scores : "  + scores[i]);
        }

    }
}

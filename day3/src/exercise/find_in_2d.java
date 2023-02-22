package exercise;

import java.io.InputStream;
import java.util.Scanner;

public class find_in_2d {
    public static void main(String[] args) {
        InputStream in = System.in;
        Scanner input = new Scanner(in);

        System.out.println("Enter size row : ");
        int row = input.nextInt();
        System.out.println("Enter size close");
        int colum = input.nextInt();

        int[][] array = new int[row][colum];
        int max = 0;

        for (int x = 0; x < row; x++) {
            for (int y = 0; y < colum; y++) {
                System.out.println("Enter row " + x + "and colum " + y );
                array[x][y] = input.nextInt();
            }
        }


        for (int x = 0; x < row; x++) {
            for (int y = 0; y < colum; y++) {
                System.out.print(array[x][y] + ",");
                if (max < array[x][y]) {
                    max = array[x][y];
                }
            }
            System.out.println();
        }

        System.out.println("the max is : " + max);

        input.close();

    }
}

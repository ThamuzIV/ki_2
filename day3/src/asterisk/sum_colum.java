package asterisk;

import java.io.InputStream;
import java.util.Scanner;

public class sum_colum {
    public static void main(String[] args) {
        InputStream in = System.in;
        Scanner input = new Scanner(in);

        System.out.println("Enter row of arr : ");
        int row = input.nextInt();
        System.out.println("Enter colum of arr : ");
        int  colum = input.nextInt();
        int wantSum;
        boolean loop;

        int[][] arr2d = new int[row][colum];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.println("Enter row " + i + " and colum " + j);
                arr2d[i][j] = input.nextInt();
            }
        }

        showArray(arr2d);

        do {
            loop = true;
            System.out.println("colum you want sum : ");
            wantSum = input.nextInt();
            if (wantSum > 0 && wantSum < arr2d[0].length){
                loop = false;
            }
        } while (loop);

        System.out.print("sum in colum "+ wantSum + " is: " + sumColum(arr2d,wantSum));
    }

    public static void showArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static int sumColum(int[][] arr,int x) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][x];
        }
        return sum;
    }
}

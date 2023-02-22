package asterisk;

import java.io.InputStream;
import java.util.Scanner;

public class sum_diagonal_line {
    public static void main(String[] args) {
        InputStream in = System.in;
        Scanner input = new Scanner(in);
        System.out.println("Enter size of matrix");
        int size = input.nextInt();
        int right_left;
        boolean loop;

        int[][] matrix = createMatrix(size);

        do {
            loop = true;
            System.out.println("Enter 1: sum left to right ; Enter 2: sum right to left");
            right_left = input.nextInt();
            if (right_left == 1 || right_left == 2) {
                loop = false;
            }
        } while (loop);

        int sum = sum_diagonal(matrix,right_left);
        System.out.println("Sum of matrix is : " + sum);
    }

    public static int[][] createMatrix(int x) {
        InputStream in = System.in;
        Scanner input = new Scanner(in);
        int[][] matrix = new int[x][x];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.println("Enter row " + i + " colum " + j);
                matrix[i][j] = input.nextInt();
            }
            System.out.println();
        }

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        return  matrix;
    }

    public static int sum_diagonal(int[][] matrix, int x) {
        int sum = 0;
        if (x == 1) {
            for (int i = 0; i <= x; i++) {
                sum += matrix[i][i];
            }
        } else {
            for (int i = matrix.length - 1; i >= 0; i--) {
                sum += matrix[i][i];
            }
        }

        return sum;
    }
}

package practice;

import java.util.Scanner;

public class rectangular_area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length(meters): ");
        float length = sc.nextFloat();
        System.out.print("Enter the width(meters): ");
        float width = sc.nextFloat();

        float acreage = length*width;
        System.out.println("Acreage of the rectangle is: " + acreage + "(m)");

        sc.close();
    }
}

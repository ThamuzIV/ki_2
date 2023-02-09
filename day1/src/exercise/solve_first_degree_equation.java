package exercise;

import java.util.Scanner;

public class solve_first_degree_equation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the information of the first order equation of the form : ax+b =c");

        System.out.println("Enter a: ");
        float a = sc.nextFloat();

        System.out.println("Enter b: ");
        float b = sc.nextFloat();

        System.out.println("Enter c:");
        float c = sc.nextFloat();

        if(a == 0 ){
            System.out.println("The equation has no solution");
        } else if (b == c) {
            float result = 0;
            System.out.println("Result is: " + result);
        } else {
            float result = (c-b)/a;
            System.out.println("Result is: " + result);
        }
        sc.close();
    }
}

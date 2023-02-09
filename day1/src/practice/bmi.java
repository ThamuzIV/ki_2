package practice;

import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your weight(kg):");
        float weight = sc.nextFloat();

        System.out.print("Enter your height(meters): ");
        float height = sc.nextFloat();

        double bmi = 0.0d;
        bmi = (weight / Math.pow(height, 2));
        bmi = Math.ceil(bmi*100)/100;


        System.out.println("Your bmi: " + bmi);

        if(bmi > 20){
            if(bmi > 25){
                if(bmi > 30){
                    System.out.println("You are fat");
                }else {
                    System.out.println("you are overweight");
                }
            }else {
                System.out.println("Your are normal");
            }
        } else {
            System.out.println("your are thin");
        }
        sc.close();
    }
}

package practice;

import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the year: ");
        int year = sc.nextInt();
        boolean leap_year = false;


        if(year %4 == 0){
            if(year %100 == 0){
                if(year %400 == 0) {
                    leap_year = true;
                }
            }else {
                leap_year = false;
            }
            leap_year = true;
        }

        if(leap_year == true){
            System.out.println(year + "is the leap year");
        } else {
            System.out.println(year + "is not leap year");
        }

        sc.close();
    }


}

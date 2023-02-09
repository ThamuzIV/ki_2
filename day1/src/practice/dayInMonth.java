package practice;

import java.util.Scanner;

public class dayInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month: ");
        byte month = sc.nextByte();

        if(month > 12 || month < 1){
            System.out.println("Not have month: " + month);
        } else {
            switch (month) {
                case 2:
                    System.out.print("month " + month + " have 28 or 29 day");
                    break;
                case   1,3,5,7,8,10,12:
                    System.out.print("month " + month + " have 31 day");
                    break;
                default:
                    System.out.println("month "  + month + " have 30 day");
            }
        }

        sc.close();

    }
}

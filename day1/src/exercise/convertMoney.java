package exercise;

import java.util.Scanner;

public class convertMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter exchange rate(donal to vnd): ");
        float exchange_rate = sc.nextFloat();

        System.out.println("Enter your amount");
        float moneyIn = sc.nextFloat();

        float moneyOut = moneyIn*exchange_rate;
        System.out.println("Your money convert to vnd is: " + moneyOut + "vnd");
    }
}

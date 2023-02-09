package exercise;

import java.util.Scanner;

public class numberReal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int convert, remainder;

        if (number < 0) {
            System.out.println("The program not support");
        }

        System.out.print(number + ": ");

        if (number > 99 && number < 1000) {

            remainder = number % 100;
            convert = (number - remainder) / 100;
            number = remainder;

            switch (convert) {
                case 1:
                    System.out.print("one");
                    break;
                case 2:
                    System.out.print("two");
                    break;
                case 3:
                    System.out.print("three");
                    break;
                case 4:
                    System.out.print("four");
                    break;
                case 5:
                    System.out.print("five");
                    break;
                case 6:
                    System.out.print("six");
                    break;
                case 7:
                    System.out.print("seven");
                    break;
                case 8:
                    System.out.print("eight");
                    break;
                default:
                    System.out.print("nine");
                    break;
            }

            System.out.print(" hundred ");
        }

        remainder = number % 10;
        convert = (number - remainder) / 10;

        if (number >= 20) {
            switch (convert) {
                case 2:
                    System.out.print("twenty ");
                    break;
                case 3:
                    System.out.print("thirty ");
                    break;
                case 4:
                    System.out.print("forty ");
                    break;
                case 5:
                    System.out.print("fifty ");
                    break;
                case 6:
                    System.out.print("sixty ");
                    break;
                case 7:
                    System.out.print("seventy ");
                    break;
                case 8:
                    System.out.print("eighty ");
                    break;
                default:
                    System.out.print("ninety ");
                    break;
            }

            switch (remainder) {
                case 1:
                    System.out.print("one");
                    break;
                case 2:
                    System.out.print("two");
                    break;
                case 3:
                    System.out.print("three");
                    break;
                case 4:
                    System.out.print("four");
                    break;
                case 5:
                    System.out.print("five");
                    break;
                case 6:
                    System.out.print("six");
                    break;
                case 7:
                    System.out.print("seven");
                    break;
                case 8:
                    System.out.print("eight");
                    break;
                default:
                    System.out.print("nine");
                    break;
            }
        } else if (number < 20 && number > 9) {
            switch (number) {
                case 10:
                    System.out.println(" ten");
                    break;
                case 11:
                    System.out.println(" eleven");
                    break;
                case 12:
                    System.out.println(" twelve");
                    break;
                case 13:
                    System.out.println(" thirteen");
                    break;
                case 14:
                    System.out.println(" fourteen");
                    break;
                case 15:
                    System.out.println(" fifteen");
                    break;
                case 16:
                    System.out.println(" sixteen");
                    break;
                case 17:
                    System.out.println(" seventeen");
                    break;
                case 18:
                    System.out.println(" eighteen");
                    break;
                default:
                    System.out.println(" nineteen");
                    break;
            }
        } else {
            switch (number) {
                case 1:
                    System.out.print("one");
                    break;
                case 2:
                    System.out.print("two");
                    break;
                case 3:
                    System.out.print("three");
                    break;
                case 4:
                    System.out.print("four");
                    break;
                case 5:
                    System.out.print("five");
                    break;
                case 6:
                    System.out.print("six");
                    break;
                case 7:
                    System.out.print("seven");
                    break;
                case 8:
                    System.out.print("eight");
                    break;
                default:
                    System.out.print("nine");
                    break;
            }
        }


    }
}

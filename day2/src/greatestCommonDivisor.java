import java.io.InputStream;
import java.util.Scanner;

public class greatestCommonDivisor {
    public static void main(String[] args) {
        InputStream in = System.in;
        Scanner input = new Scanner(in);
        System.out.println("Enter number a:");
        int numberA = input.nextInt();
        System.out.println("Enter number b:");
        int numberB = input.nextInt();

        int common;
        boolean notHave = true;

        if (numberA <= 0 || numberB <= 0) {
            System.out.println("m trêu t à ? 0 với âm thì tìm kiểu qq à");
        } else {
            if (numberA < numberB) {
                int convert = numberB;
                numberB = numberA;
                numberA = convert;
            }

            if (numberA % 2 == 1) {
                common = (numberA - 1) / 2;
            } else {
                common = numberA / 2;
            }

            if (common < numberB) {
                for (; common >= 0; common--) {
                    if (numberA % common == 0 && numberB % common == 0) {
                        System.out.println("Greatest common divisor is: " + common);
                        notHave = false;
                        break;
                    }
                }
            } else {
                common = numberB;
                for (; common >= 0; common--) {
                    if (numberA % common == 0 && numberB % common == 0) {
                        System.out.println("Greatest common divisor is: " + common);
                        notHave = false;
                        break;
                    }
                }
            }

            if (notHave) {
                System.out.println("greatest common divisor is: 1");
            }

        }

        input.close();
    }
}

import java.io.InputStream;
import java.util.Scanner;

public class Temperature_conversion {
    public static void main(String[] args) {
        InputStream in = System.in;
        Scanner input = new Scanner(in);
        System.out.println("C to F enter 1, F to C enter 2");
        int choose = input.nextInt();
        System.out.println("Enter element");
        double element = input.nextInt();

        double result = conversion(choose,element);
        System.out.println("value after being transferred " + result);

    }


    public static double conversion(int a, double element) {
        double result = 0;
        switch (a) {
            case 1:
                result = element * 1.8 + 32 ;
            break;
            case 2:
                result = (element - 32) / 1.8 ;
                break;
            default:
                System.out.println("No support");
        }

        return result;
    }
}

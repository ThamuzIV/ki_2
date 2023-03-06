import java.io.InputStream;
import java.util.Scanner;

public class bankInterest {
    public static void main(String[] args) {
        InputStream in = System.in;
        Scanner input = new Scanner(in);
        System.out.println("Enter your money($)");
        float moneyHave = input.nextFloat();
        System.out.println("Enter your interest");
        float interest = input.nextFloat() / 100;
        System.out.println("Enter month");
        float month = input.nextFloat();
        float moneyOut = moneyHave;

        if(moneyHave <= 0 || interest <= 0 || month <= 0 ){
            System.out.println("input error");
        }else {
            for (int i = 1;i <= month;i++ ){
                moneyOut = moneyOut + moneyHave*interest ;
                moneyHave = moneyOut;
            }

            System.out.println("money you have: " + moneyOut);
        }
        input.close();
    }
}

package asterisk;

import java.io.InputStream;
import java.util.Scanner;

public class count_duplicate {
    public static void main(String[] args) {
        InputStream in = System.in;
        Scanner input = new Scanner(in);

        System.out.println("Enter document:");
        String data = input.nextLine();

        System.out.println("Enter chair you want count: ");
        char find = (input.next()).charAt(0);
        int count = 0;


        for (int i = 0; i < data.length(); i++) {
            char x = data.charAt(i);
            if (find == x) {
                count++;
            }
        }

        System.out.println("The '" + find + "' duplicate " + count + " time" );
    }
}

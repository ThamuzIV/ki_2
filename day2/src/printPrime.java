import java.io.InputStream;
import java.util.Scanner;

public class printPrime {
    public static void main(String[] args) {

        System.out.println("prime 1: 2");
        System.out.println("prime 2: 3");
        int show = 2;
        int i = 5;

         while (show <= 20) {
             boolean prime = true;
             for (int j = 5; j < i; j += 2){
                 if(i % j == 0){
                     prime = false;
                 }
             }
             if(prime){
                 System.out.println("prime " + show + ": " + i) ;
                 show ++;
             }
             i += 2;
        }
    }
}

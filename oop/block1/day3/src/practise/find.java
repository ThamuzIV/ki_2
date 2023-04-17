package practise;

import java.io.InputStream;
import java.util.Scanner;

public class find {
    public static void main(String[] args) {
        InputStream in = System.in;
        Scanner input = new Scanner(in);
        String[] listStudent = {"Gia","Minh","Nguyen","Hoang","Viet"};

        System.out.println("Enter name student: ");
        String name = input.next();
        int location = 0;
        boolean exit = true;

        for(String x: listStudent) {
            if (x.equals(name)){
                System.out.println("the student " + x + " in " + location);
                exit = false;
            }
        }

        if (exit){
            System.out.println("this name not have in location");
        }

        input.close();

    }
}
package exercise;

import java.io.InputStream;
import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        InputStream in = System.in;
        Scanner input = new Scanner(in);

        String[] data = {"minh","gia","nguyen","hoang"};


        System.out.println("This is we data!");
        for (String i : data) {
            System.out.print(i + " ;");
        }

        byte loop;

        do {
            System.out.println("Enter 1 to exercise.add or 2 to end the program");
            loop = input.nextByte();

            if (loop == 1) {
                System.out.println("what name you want to exercise.add ");
                String name = input.next();
                System.out.println("where is location? (start at 0)");
                int location = input.nextInt();

                if (location >= data.length) {
                    String[] newData = new String[location+1];
                    for (int x = 0; x <= location; x++) {
                        if (x == location) {
                            newData[x] = name;
                        } else if (x >= data.length) {
                            newData[x] = " ";
                        } else {
                            newData[x] = data[x];
                        }
                    }

                    for (String x : newData) {
                        System.out.print(x + ",");
                    }
                } else {
                    String[] newData = new String[data.length];
                    for (int x = 0; x < data.length; x++) {
                        if (x == location) {
                            newData[x] = name;
                        } else {
                            newData[x] = data[x];
                        }
                    }

                    for (String x : newData) {
                        System.out.print(x + ",");
                    }
                }
            }
        } while (loop == 2);

        input.close();
    }
}

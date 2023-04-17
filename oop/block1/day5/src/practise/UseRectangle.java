package block1.day5.src.practise;

import java.io.InputStream;
import java.util.Scanner;

public class UseRectangle {
    public static void main(String[] args) {
        InputStream in = System.in;
        Scanner input = new Scanner(in);
        System.out.println("Enter the width");
        double width = input.nextDouble();
        System.out.println("Enter the height");
        double height = input.nextDouble();

        Rectangle rectangle = new Rectangle();

        System.out.println("Your rectangle \n" + rectangle.display());
        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: " + rectangle.getArea());
    }
}

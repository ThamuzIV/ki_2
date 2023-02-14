import java.io.InputStream;
import java.util.Scanner;

public class draw {
    public static void main(String[] args) {
        InputStream in = System.in;
        Scanner input = new Scanner(in);

        System.out.println("              Menu");
        System.out.println("Please select the picture you want to draw(choose the number)");
        System.out.println("1 : rhombus");
        System.out.println("2 : parallelogram");
        System.out.println("3 : isosceles trapezoid");
        System.out.println("4 : heart");
        int choose = input.nextInt();

        if (choose == 1) {

            System.out.println("Enter the radius");
            int radius = input.nextInt();
            int dot = 1;
            int space = radius;
            for (int width = radius ; width > 0; width-- ){
                    for (int i = space ;i > 0; i--){
                        System.out.print("  ");
                    }

                for (int i = 1;i <= dot;i ++){
                    System.out.print("* ");
                }
                space--;
                dot += 2;
                System.out.println("");
            }

            dot -= 4;
            space = 2;
            for (int width = radius ; width > 0; width-- ){

                for (int i = space ;i > 0; i--){
                    System.out.print("  ");
                }

                for (int i = 1;i <= dot;i ++){
                    System.out.print("* ");
                }

                space++;
                dot -= 2;
                System.out.println("");
            }
        } else if (choose == 4) {
            System.out.println("Enter");
            int radius = input.nextInt();
            int row;
            int dot, dot2, space, space2;

            space = radius;
            space2 = 2 * radius;
            dot = 1;

            for (int z = 0; z <= radius; z++) {
                for (int y = 0; y <= space; y++) {
                    System.out.print("__");
                }

                for (int d = 1; d <= dot; d++) {
                    System.out.print("* ");
                }

                for (int y = 0; y <= space2; y++) {
                    System.out.print("__");
                }

                for (int d = 1; d <= dot; d++) {
                    System.out.print("* ");
                }

                for (int y = 0; y <= space - 1; y++) {
                    System.out.print("__");
                }
                System.out.println("");

                space--;
                space2 -= 2;
                dot += 2;
            }

            for (int x = 0; x < (radius - radius % 2) / 2; x++) {
                for (int i = 1; i < (radius * 4 + 5); i++) {
                    System.out.print("* ");
                }
                System.out.println("");
            }

            space = 1;
            dot2 = radius * 4 + 2;
            for (int x = 0; x < radius * 2 + 1; x++) {
                for (int i = 1; i <= space; i++) {
                    System.out.print("__");
                }

                for (int y = 0; y < dot2; y++) {
                    System.out.print("* ");
                }

                for (int i = 1; i <= space; i++) {
                    System.out.print("__");
                }

                dot2 -= 2;
                space++;
                System.out.println("");
            }

            System.out.println("     LÊ HIỀN THƯƠNG  !!!");
            System.out.println("     I LOVE YOU 3000 <3 !!!!!");
            System.out.println("     HAPPY VALENTINE >.<");
        }
    }
}

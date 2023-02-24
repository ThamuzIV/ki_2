import java.io.InputStream;
import java.util.Scanner;

public class find_min {
    public static void main(String[] args) {
        InputStream in = System.in;
        Scanner input = new Scanner(in);

        System.out.println("size array = ");
        int size = input.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter element " + i + " : ");
            array[i] = input.nextInt();
        }

        System.out.println("the min number in arr is: " + find_min(array));
    }

    public static int find_min(int[] arr) {
        int result = arr[0];
        for (int i : arr) {
            if (result > i) {
                result =  i;
            }
        }
        return result;
    }
}

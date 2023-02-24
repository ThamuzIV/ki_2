import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class delete {
    public static void main(String[] args) {

        InputStream in = System.in;
        Scanner input = new Scanner(in);

        String [] array = {"exercise","b","c","d","e","hello","h","j","k","n","m","l"};

        for (String x : array) {
            System.out.print(x + ";");
        }

        System.out.println();
        System.out.print("Enter the text you want delete: ");
        String delete = input.nextLine();


        for (int i = 0; i < array.length ; i++) {
            if (delete.equals(array[i])) {
                if (i == array.length - 1) {
                    array[i] = "";
                    break;
                }
                array[i] = array[i+1];
            }
        }

        for (String i:array){
            System.out.print(i + " ");
        }

        System.out.println();
        String[] array2 = new String[11];
        array2 = deleteArr2( array, 5);
        System.out.println(Arrays.toString(array2));

        array2 = deleteArr2(array,0);
        System.out.println(Arrays.toString(array2));
        input.close();

    }

    public static String[] deleteArr(String[]  arr, int x) {
        int size = arr.length - 1;
        String[] newarr = new String[size];
        for (int i = 0; i < size; i++) {
            if (i < x) {
                newarr[i] = arr[i];
            } else {
                newarr[i] = arr[i+1];
            }
        }

        return newarr;
    }

    public static String[] deleteArr2(String[] arr, int x) {
        int size = arr.length -1;
        String[] newarr = new String[size];

        System.arraycopy(arr,0,newarr,0,x);
        System.arraycopy(arr,x+1,newarr,x,size-x);
        return newarr;
    }

}

public class prime2 {
    public static void main(String[] args) {
        int count = 2;
        int number = 5;

        for (; count < 20; number += 2){
            boolean prime = true;
            for (int i = 3; i < number ; i += 2){
                if ( number %i == 0){
                    prime = false;
                }
            }
            if (prime){
                count ++;
                System.out.println("The prime " + count + " is: " + number);
            }
        }
    }
}

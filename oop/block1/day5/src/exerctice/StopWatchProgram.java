package block1.day5.src.exerctice;

import java.util.Random;

public class StopWatchProgram {
    public static void main(String[] args) {
//        int[] arrayNumber = new int[100000];
        int[] arrayNumber = new int[5];
        Random random = new Random();
        for (int i = 0; i < arrayNumber.length; i++) {
            arrayNumber[i] = random.nextInt(10);
        }

        StopWatch stopWatch = new StopWatch();
        selectionSort(arrayNumber);
        System.out.println("Time run program is: " + stopWatch.getElapsedTime()+ " milliseconds");
    }

    private static void selectionSort(int[] arrray){
        for (int i = 0; i < arrray.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arrray.length; j++) {
                if (arrray[j] < arrray[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arrray[i];
            arrray[i] = arrray[minIndex];
            arrray[minIndex] = temp;
        }
    }


}

class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    public void start(){
        startTime = System.currentTimeMillis();
    }

    public void stop(){
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }
}
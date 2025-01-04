package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {

    public static void main(String[] args) {
        int[] arr = new int[100];
        Random rand = new Random();

        for (int i = 0; i < 100; i++) {
            arr[i] = rand.nextInt(10000);
        }

        int index = -1;
        int sum = 0;
        for (int i = 0; i < 97; i++) {
            int temp = arr[i] + arr[i + 1] + arr[i + 2];
            if (temp > sum) {
                sum = temp;
                index = i;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(sum);
        System.out.println(index);
    }

}

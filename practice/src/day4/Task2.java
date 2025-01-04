package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {

    public static void main(String[] args) {
        int[] arr = new int[100];
        Random rand = new Random();

        int mx = -1;
        int mn = 10001;
        int lengthUntill0 = 0;
        int sumUntill0 = 0;
        boolean flag = false;

        for (int i = 0; i < 100; i++) {
            arr[i] = rand.nextInt(10000);
            mx = Math.max(mx, arr[i]);
            mn = Math.min(mn, arr[i]);
            if (arr[i] == 0) {
                flag = true;
            }
            if (!flag) {
                lengthUntill0++;
                sumUntill0 += arr[i];
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Maximum: " + mx);
        System.out.println("Minimum: " + mn);
        System.out.println("Length of array till first zero: " + lengthUntill0);
        System.out.println("Sum of array till first zero: " + sumUntill0);
    }

}

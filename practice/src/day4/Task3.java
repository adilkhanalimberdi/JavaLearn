package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {

    public static void main(String[] args) {
        int m = 12, n = 8;
        int[][] mat = new int[m][n];
        Random rand = new Random();

        int maxSum = 0;
        int res = 0;
        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                mat[i][j] = rand.nextInt(50);
                sum += mat[i][j];
            }
            if (sum >= maxSum) {
                maxSum = sum;
                res = i;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Row with the maximum sum: " + res);
    }

}

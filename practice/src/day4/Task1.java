package day4;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n = in.nextInt();

        int[] arr = new int[n];
        int greaterThanEight = 0;
        int evenNumbers = 0;
        int oddNumbers = 0;
        int equalsToOne = 0;
        int sumOfArray = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = randInt();
            sumOfArray += arr[i];
            if (arr[i] % 2 == 0) {
                evenNumbers++;
            } else {
                oddNumbers++;
            }
            if (arr[i] > 8) {
                greaterThanEight++;
            }
            if (arr[i] == 1) {
                equalsToOne++;
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Length of array: " + n);
        System.out.println("The number of numbers that greater than 8: " + greaterThanEight);
        System.out.println("The number of numbers that equals to 1: " + equalsToOne);
        System.out.println("The number of even numbers: " + evenNumbers);
        System.out.println("The number of odd numbers: " + oddNumbers);
        System.out.println("The sum of array: " + sumOfArray);
    }

    public static int randInt() {
        return (int)(Math.random() * 11);
    }

}

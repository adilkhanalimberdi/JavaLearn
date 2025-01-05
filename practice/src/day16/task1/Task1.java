package day16.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        File file = new File("JavaLearnCourse/practice/src/day16/task1/in.txt");
        printResult(file);
    }

    public static void printResult(File file) {
        try {
            Scanner in = new Scanner(file);
            double sum = 0, nums = 0;
            while (in.hasNextInt()) {
                sum += in.nextInt();
                nums++;
            }
            double avg = sum / nums;
            System.out.print(avg);
            System.out.printf(" --> %.3f%n", avg);
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found!");
        }
    }

}

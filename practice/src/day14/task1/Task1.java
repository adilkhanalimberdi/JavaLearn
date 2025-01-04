package day14.task1;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        File file = new File("JavaLearnCourse/practice/src/day14/task1/in.txt");
        try {
            printSumDigits(file);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void printSumDigits(File file) throws Exception {
        try {
            Scanner input = new Scanner(file);
            ArrayList <Integer> arr = new ArrayList<>();
            int sum = 0;

            while (input.hasNextInt()) {
                arr.add(input.nextInt());
                sum += arr.getLast();
            }

            if (arr.size() != 10) {
                throw new Exception("InvalidInputFile");
            }

            System.out.println(sum);
        } catch (FileNotFoundException e) {
            throw new Exception("File Not Found!");
        }
    }

}

package day16.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) throws IOException, FileNotFoundException {
        FileWriter file1 = new FileWriter("JavaLearnCourse/practice/src/day16/task2/file1.txt");
        Random rand = new Random();
        for (int i = 0; i < 1000; i++) {
            file1.write(Integer.toString(rand.nextInt(0, 101)) + " ");
            file1.flush();
        }
        file1.close();

        ArrayList <Integer> nums = new ArrayList<>();
        File file = new File("JavaLearnCourse/practice/src/day16/task2/file1.txt");
        FileWriter file2 = new FileWriter("JavaLearnCourse/practice/src/day16/task2/file2.txt");
        Scanner in = new Scanner(file);
        for (int i = 0; i < 50; i++) {
            double count = 0, sum = 0;
            while (in.hasNextInt() && count < 20) {
                sum += in.nextInt();
                count++;
            }
            file2.write((sum / 20.0) + " ");
            file2.flush();
        }
        file2.close();

        file = new File("JavaLearnCourse/practice/src/day16/task2/file2.txt");
        printResult(file);
    }

    public static void printResult(File file) throws FileNotFoundException {
        double sum = 0;
        Scanner in = new Scanner(file);
        String[] doubles = in.nextLine().split(" ");
        for (String i : doubles)
            sum += Double.parseDouble(i);
        System.out.println((int)sum);
    }

}

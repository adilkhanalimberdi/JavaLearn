package day14.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        File file = new File("JavaLearnCourse/practice/src/day14/people.txt");
        try {
            System.out.println(parseFileToStringList(file));
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static ArrayList <String> parseFileToStringList(File file) throws Exception {
        try {
            ArrayList <String> res = new ArrayList<>();
            Scanner in = new Scanner(file);
            while (in.hasNextLine()) {
                String[] p = in.nextLine().split(" ");
                int age = Integer.parseInt(p[1]);
                String name = p[0];
                if (age < 0) {
                    throw new Exception("Invalid Input File!");
                }
                res.add(name + " " + age);
            }
            return res;
        } catch(FileNotFoundException e) {
            throw new Exception("File Not Found!");
        }
    }

}

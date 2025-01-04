package day14.task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        File file = new File("JavaLearnCourse/practice/src/day14/people.txt");
        try {
            System.out.println(parseFileToObjList(file));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static ArrayList <Person> parseFileToObjList(File file) throws Exception {
        try {
            ArrayList <Person> res = new ArrayList<>();
            Scanner in = new Scanner(file);
            while (in.hasNextLine()) {
                String[] temp = in.nextLine().split(" ");
                String name = temp[0];
                int age = Integer.parseInt(temp[1]);
                if (age < 0) {
                    throw new Exception("Invalid Input File!");
                }
                res.add(new Person(name, age));
            }
            return res;
        } catch (FileNotFoundException e) {
            throw new Exception("File Not Found!");
        }
    }

}

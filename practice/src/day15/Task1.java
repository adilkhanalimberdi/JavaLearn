package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("JavaLearnCourse/JavaMarathon2020/src/main/resources/shoes.csv");
        findMissingShoes(file);
    }

    public static void findMissingShoes(File file) {
        try {
            Scanner in = new Scanner(file);
            FileWriter fwrite = new FileWriter("JavaLearnCourse/JavaMarathon2020/src/main/resources/missing_shoes.txt");
            while (in.hasNextLine()) {
                String parts[] = in.nextLine().split(";");
                if (Integer.parseInt(parts[2]) == 0) {
                    String temp = parts[0] + ", " + parts[1] + ", " + parts[2];
                    fwrite.write(temp + "\n");
                    fwrite.flush();
                }
            }
            fwrite.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found!");
        } catch (IOException e) {
            System.out.println("Error With Writing!");
        }
    }

}

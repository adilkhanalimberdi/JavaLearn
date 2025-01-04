package day12;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        ArrayList <String> arr = new ArrayList<>(Arrays.asList("Mercedes", "Audi", "BMW", "Volkswagen", "Rolls Royce"));
        System.out.println(arr);
        arr.add(3, "Mercedes");
        arr.removeFirst();
        System.out.println(arr);
    }

}

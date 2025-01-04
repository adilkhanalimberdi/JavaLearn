package day12;

import java.util.ArrayList;

public class Task2 {

    public static void main(String[] args) {
        ArrayList <Integer> nums = new ArrayList<>();
        for (int i = 0; i <= 30; i += 2) {
            nums.add(i);
        }
        for (int i = 300; i <= 350; i += 2) {
            nums.add(i);
        }

        System.out.println(nums);
    }

}

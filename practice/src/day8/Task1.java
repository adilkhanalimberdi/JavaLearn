package day8;

import java.time.*;
import java.lang.StringBuilder;

public class Task1 {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        // first way
        String res = "";
        for (int i = 0; i <= 20000; i++) {
            res += i;
            res += " ";
        }

        long end = System.currentTimeMillis();
        long duration1 = end - start;

        start = System.currentTimeMillis();

        // second way
        StringBuilder str = new StringBuilder();
        for (int i = 0; i <= 20000; i++) {
            str.append(i).append(" ");
        }

        end = System.currentTimeMillis();
        long duration2 = end - start;

        // System.out.println(res);
        // System.out.println(str);

        System.out.println("First way takes - " + duration1 + "ms\nSecond way takes - " + duration2 + "ms");

    }

}

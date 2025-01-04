package day6.task3;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Teacher {
    private String name;
    private String subject;
    private Random rand = new Random();
    private HashMap <Integer, String> m = new HashMap<>(Map.of(
            2, "Unsatisfactory",
            3, "Satisfactory",
            4, "Good",
            5, "Excellent"
    ));

    // constructor
    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    // getter
    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void evaluate(String studentName) {
        String grade = m.get(rand.nextInt(2, 6));
        System.out.println("Teacher " + getName() + " rated student " + studentName + " as " + grade + " in the subject " + getSubject() + ".");
    }
}

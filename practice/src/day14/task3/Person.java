package day14.task3;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "{name=" + this.name + ", age=" + this.age + "}";
    }
}

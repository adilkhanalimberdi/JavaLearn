package day5.task2;

public class Task2 {

    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle(2020, "Gray", "Brabus 1300 R");

        System.out.println(motorcycle.getModel());
        System.out.println(motorcycle.getColor());
        System.out.println(motorcycle.getYear());
    }

}

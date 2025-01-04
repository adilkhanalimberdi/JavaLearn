package day6.task2;

public class Task2 {

    public static void main(String[] args) {
        Airplane plane = new Airplane("Irkutskyi aviatsionnyi zavod", 2016, 36.8, 72400);
        plane.setYear(2017);
        plane.setLength(42.3);

        plane.fillUp(200);
        plane.fillUp(400);

        plane.info();
    }

}

package day5.task1;

public class Task1 {

    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Mercedes W210");
        car.setColor("Black");
        car.setYear(2019);

        System.out.println(car.getYear());
        System.out.println(car.getModel());
        System.out.println(car.getColor());
    }

}


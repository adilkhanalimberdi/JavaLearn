package day6.task1;

public class Task1 {

    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Audi");
        car.setColor("White");
        car.setYear(2015);

        Motorcycle motobike = new Motorcycle(2019, "Red", "Kawasaki");

        car.info();
        motobike.info();

        car.yearDifference(2025);
    }

}

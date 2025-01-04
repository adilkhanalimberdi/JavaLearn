package day5.task2;

public class Motorcycle {
    private int year;
    private String color;
    private String model;

    Motorcycle(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}

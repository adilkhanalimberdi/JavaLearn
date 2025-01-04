package day6.task1;

public class Motorcycle extends Supporter {
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

    void info() {
        System.out.println("This is a motorcycle");
    }

    void yearDifference(int year) {
        System.out.println(Math.abs(this.year - year));
    }
}

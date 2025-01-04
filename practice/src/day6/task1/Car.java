package day6.task1;

public class Car extends Supporter {
    private int year;
    private String color;
    private String model;

    // setters
    public void setYear(int year) {
        this.year = year;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setModel(String model) {
        this.model = model;
    }

    //getters
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
        System.out.println("This is a car");
    }

    void yearDifference(int year) {
        System.out.println(Math.abs(this.year - year));
    }
}

package day8.task2;

public class Airplane {
    private String producer;
    private int year;
    private double length;
    private double weight;
    private int fuel;

    public Airplane(String producer, int year, double length, double weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void fillUp(int fuel) {
        this.fuel += fuel;
    }

    public void info() {
        System.out.println("Producer: " + producer + "\nYear of manufacture: " + year + "\nLength(metre): " + length + "\nWeight(kilogram): " + weight + "\nFuel(litre): " + fuel);
    }

    // setter
    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    //getter
    public String getProducer() {
        return producer;
    }

    public int getYear() {
        return year;
    }

    public double getLength() {
        return length;
    }

    public double getWeight() {
        return weight;
    }

    public int getFuel() {
        return fuel;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "producer='" + producer + '\'' +
                ", year=" + year +
                ", length=" + length +
                ", weight=" + weight +
                ", fuel=" + fuel +
                '}';
    }
}

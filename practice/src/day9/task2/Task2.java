package day9.task2;

public class Task2 {

    public static void main(String[] args) {
        Figure circle = new Circle("White", 5);
        Figure rectangle = new Rectangle("Blue", 4, 5);
        Figure triangle = new Triangle("Red", 3, 4, 5);

        System.out.println("Perimeter of circle - " + circle.perimeter() + ", area of circle - " + circle.area());
        System.out.println("Perimeter of rectangle - " + rectangle.perimeter() + ", area of rectangle - " + rectangle.area());
        System.out.println("Perimeter of triangle - " + triangle.perimeter() + ", area of triangle - " + triangle.area());
    }

}

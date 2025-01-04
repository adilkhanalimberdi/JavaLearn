package day6.task3;

public class Task3 {

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Alex", "Mathematics");
        Student student = new Student("Steve");

        teacher.evaluate(student.getName());
    }

}

package day9.task1;

public class Task1 {

    public static void main(String[] args) {
        Student student = new Student("Adilkhan", "09-P");
        Teacher teacher = new Teacher("Arunaz", "INF-106");

        System.out.println(student.getStudyGroup());
        System.out.println(teacher.getSubject());

        student.printInfo();
        teacher.printInfo();
    }

}

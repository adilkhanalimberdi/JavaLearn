package day9.task1;

public class Teacher extends Human {
    private String subject;

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("This is a teacher named " + super.name + " and who teaches at " + getSubject());
    }
}

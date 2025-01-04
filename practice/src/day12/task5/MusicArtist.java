package day12.task5;

public class MusicArtist {
    String name;
    int age;

    public MusicArtist(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name + " - " + age + "y.o";
    }
}

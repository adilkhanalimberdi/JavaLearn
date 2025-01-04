package day12.task4;

import java.util.ArrayList;

public class MusicBand {
    private String name;
    private int year;
    private ArrayList<String> members;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void addMember(String member) {
        this.members.add(member);
    }

    public void clearMembers() {
        this.members.clear();
    }

    public void setMembers(ArrayList<String> members) {
        this.members = members;
    }

    public ArrayList<String> getMembers() {
        return members;
    }

    public void printMembers() {
        System.out.println(members);
    }

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
        this.members = new ArrayList <>();
    }

    public MusicBand(String name, int year, ArrayList <String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public String toString() {
        return name + " - " + year;
    }

    public static void transferMembers(MusicBand firstBand, MusicBand secondBand) {
        for (String member : firstBand.getMembers()) {
            secondBand.addMember(member);
        }
        firstBand.clearMembers();
    }
}

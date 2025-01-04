package day12.task5;

import java.util.ArrayList;

public class MusicBand {
    private String name;
    private int year;
    private ArrayList<MusicArtist> members;

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

    public void addMember(MusicArtist member) {
        this.members.add(member);
    }

    public void clearMembers() {
        this.members.clear();
    }

    public void setMembers(ArrayList<MusicArtist> members) {
        this.members = members;
    }

    public ArrayList<MusicArtist> getMembers() {
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

    public MusicBand(String name, int year, ArrayList <MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public String toString() {
        return name + " - " + year;
    }

    public static void transferMembers(MusicBand firstBand, MusicBand secondBand) {
        for (MusicArtist member : firstBand.getMembers()) {
            secondBand.addMember(member);
        }
        firstBand.clearMembers();
    }
}

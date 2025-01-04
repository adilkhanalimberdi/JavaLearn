package day12.task5;

import java.util.ArrayList;
import java.util.Arrays;

public class Task5 {

    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("Nirvana", 1994);
        MusicBand band2 = new MusicBand("Deftones", 1988);

        band1.setMembers(new ArrayList<>(Arrays.asList(new MusicArtist("Kurt Cobain", 38), new MusicArtist("Krist Novoselic", 43), new MusicArtist("Dave Crohl", 37))));
        band2.setMembers(new ArrayList<>(Arrays.asList(new MusicArtist("Chino Moreno", 41), new MusicArtist("Stephan Carpenter", 42), new MusicArtist("Frank Felgado", 40), new MusicArtist("Abe Cunningham", 35))));

        System.out.println(band1);
        band1.printMembers();
        System.out.println(band2);
        band2.printMembers();

        MusicBand.transferMembers(band1, band2);

        System.out.println(band1);
        band1.printMembers();
        System.out.println(band2);
        band2.printMembers();
    }

}

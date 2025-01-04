package day12.task4;

import java.util.ArrayList;
import java.util.Arrays;

public class Task4 {

    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("Nirvana", 1994);
        MusicBand band2 = new MusicBand("Deftones", 1988);

        band1.setMembers(new ArrayList<>(Arrays.asList("Kurt Cobain", "Krist Novoselic", "Dave Grohl")));
        band2.setMembers(new ArrayList<>(Arrays.asList("Chino Moreno", "Stephan Carpenter", "Frank Delgado", "Abe Cunningham")));

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

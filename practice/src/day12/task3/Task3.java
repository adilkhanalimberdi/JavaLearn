package day12.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task3 {

    public static void main(String[] args) {
        List <MusicBand> bands = new ArrayList <>(Arrays.asList(
                new MusicBand("Nirvana", 1987),
                new MusicBand("The Beatles", 1960),
                new MusicBand("Deftones", 1988),
                new MusicBand("Foo Fighters", 1994),
                new MusicBand("Hope Is a Lie", 2023),
                new MusicBand("The Arctic Monkeys", 2002),
                new MusicBand("The Strokes", 2000),
                new MusicBand("Soundgarden", 1994),
                new MusicBand("Chevelle", 2002),
                new MusicBand("Royal Blood", 2014)
        ));

        Collections.shuffle(bands);
        List <MusicBand> bandsAfter2000 = groupsAfter2000(bands);

        System.out.println(bands);
        System.out.println(bandsAfter2000);
    }

    public static List <MusicBand> groupsAfter2000(List <MusicBand> bands) {
        List <MusicBand> res = new ArrayList<>();
        for (MusicBand band : bands) {
            if (band.getYear() >= 2000) {
                res.add(band);
            }
        }
        return res;
    }

}

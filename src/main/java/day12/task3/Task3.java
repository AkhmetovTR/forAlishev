package day12.task3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> band = new ArrayList<>();
        band.add(new MusicBand("ABBA", 1972));
        band.add(new MusicBand("Lumen", 1998));
        band.add(new MusicBand("December2012", 2011));
        band.add(new MusicBand("SUM41", 1996));
        band.add(new MusicBand("Слот", 2002));
        band.add(new MusicBand("ВИА Гра", 2000));
        band.add(new MusicBand("Любэ", 1989));
        band.add(new MusicBand("ABBA", 1972));
        band.add(new MusicBand("Йорш", 2006));
        band.add(new MusicBand("Matrang", 2012));
        band.add(new MusicBand("Boney M", 1975));
        System.out.println(band);
        System.out.println(groupsAfter2000(band));

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> bandsAfter2000 = new ArrayList<>();
        for (MusicBand x : bands
        ) {
            if (x.getYear() > 2000) {
                bandsAfter2000.add(x);
            }

        }
        return bandsAfter2000;

    }
}

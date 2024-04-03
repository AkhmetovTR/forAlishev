package day12.task5;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        MusicBand abba = new MusicBand("Abba", 1972, Arrays.asList(new MusicArtist("Агнета Осе Фельтског", 1950), new MusicArtist("Бьорн Кристиан Ульвеус", 1945), new MusicArtist("Йёран Брур Бенни Андерссон", 1946), new MusicArtist("Анни-Фрид Сюнни Люнгстад", 1945)));
        MusicBand modernTalking = new MusicBand("Modern Talking", 1984, Arrays.asList(new MusicArtist("То́мас А́ндерс", 1963), new MusicArtist("Ди́тер Гю́нтер Бо́лен", 1954)));
        System.out.println(abba);
        System.out.println(modernTalking);
        MusicBand.transferMembers(abba, modernTalking);
        System.out.println(abba);
        System.out.println(modernTalking);
        System.out.println("------");
        abba.printMembers();
        System.out.println("------");
        modernTalking.printMembers();
    }
}

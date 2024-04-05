package day12.task4;

import java.util.ArrayList;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        MusicBand abba = new MusicBand("ABBA", 1972,new ArrayList<>( Arrays.asList("Агнета Фельтског", "Бьорн Ульвеус", "Бенни Андерссон", "Анни-Фрид Лингстад")));
        MusicBand modernTalking = new MusicBand("Modern Talking", 1984,new ArrayList<>( Arrays.asList("Томас Андерс", "Дитер Болен")));
        System.out.println(abba);
        System.out.println(modernTalking);
        MusicBand.transferMembers(abba, modernTalking);
        System.out.println(abba);
        System.out.println("-------------");
        modernTalking.printMembers();

    }
}

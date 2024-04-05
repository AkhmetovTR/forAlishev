package day12.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members = new ArrayList<>();

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public List<String> getMembers() {
        return members;
    }

    public void printMembers(){
        for (String x: members
             ) {
            System.out.println(x);
        }
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", members=" + members +
                '}';
    }
    public static void transferMembers(MusicBand a, MusicBand b){
      b.members.addAll(a.members);
      a.members.clear();
    }
}

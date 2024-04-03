package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members = new ArrayList<>();

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void printMembers(){
        for (MusicArtist x: members
             ) {
            System.out.println(x.getName());
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
       List<MusicArtist>newMembers = new ArrayList<>(b.members);
       newMembers.addAll(a.members);
       b.members=newMembers;
       a.members=new ArrayList<>();
    }
}

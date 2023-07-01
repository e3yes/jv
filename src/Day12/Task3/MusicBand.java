package Day12.Task3;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;

    public MusicBand(String name, int year){
        this.name = name;
        this.year = year;
    }

    public String toString(){
        return "Name = "+name+" Year = "+year;
    }


    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
}

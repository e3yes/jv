package Day12.Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task3 {

    public static void main(String[] args) {
        MusicBand musicBand = new MusicBand("cleanera", 2023);
        MusicBand musicBand2 = new MusicBand("myfour", 2017);
        MusicBand musicBand3 = new MusicBand("group3", 1999);
        MusicBand musicBand4 = new MusicBand("group4", 1003);
        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(musicBand);
        musicBands.add(musicBand2);
        musicBands.add(musicBand3);
        musicBands.add(musicBand4);

        System.out.println("Old musicBands = " + musicBands);
        System.out.println("New musicBands = " + groupsAfter2000(musicBands));

    }
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> newBands = new ArrayList<>();
        for(MusicBand ms:bands){
            if(ms.getYear() > 2000){
                newBands.add(ms);
            }
        }

        return newBands;
    }
}

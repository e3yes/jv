package Day12.Task5;

public class MusicArtist extends MusicBand {
    private String name;
    private int yearsold;

    public MusicArtist(String name, int yearsold) {
        super(name, yearsold);
        this.name = name;
        this.yearsold = yearsold;
    }

    public String toString(){
        return name+" "+yearsold;
    }
}

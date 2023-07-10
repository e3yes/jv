package Day12.Task5;

public class Task5 {
    public static void main(String[] args) {
        MusicBand musicBand1 = new MusicBand("Cleanera",2000);
        MusicBand musicBand2 = new MusicBand("Myfour",2016);

        musicBand1.addMembers();
        musicBand1.printMembers();

        musicBand2.addMembers();
        musicBand2.printMembers();

        MusicBand.transferMembers(musicBand1,musicBand2);
        musicBand1.printMembers();
        musicBand2.printMembers();
    }
}

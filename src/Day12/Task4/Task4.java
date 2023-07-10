package Day12.Task4;

public class Task4 {
    public static void main(String[] args) {
        MusicBand musicBand1 = new MusicBand("Cleanera",2000);
        MusicBand musicBand2 = new MusicBand("Myfour", 2006);
        System.out.println(musicBand1.getName());
        musicBand1.addMembers();
        musicBand1.printMembers();
        musicBand1.deleteMembers();
        musicBand1.printMembers();

        System.out.println(musicBand2.getName());
        musicBand2.addMembers();
        musicBand2.printMembers();
        musicBand2.deleteMembers();
        musicBand2.printMembers();

        musicBand1.transferMembers(musicBand1,musicBand2);
        System.out.println(musicBand1.getMembers());
        System.out.println(musicBand2.getMembers());
    }
}

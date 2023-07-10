package Day12.Task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MusicBand {
    private String name;
    private int year;

    List<MusicArtist> members = new ArrayList<>();

    public MusicBand(String name, int year){
        this.name = name;
        this.year = year;
    }
    public String toString(){
        return name;
    }

    public void addMembers(){
        System.out.println("Сколько участников вы хотите добавить");
        Scanner sc1 = new Scanner(System.in);
        int membersInt = sc1.nextInt();

        if(membersInt<=0){
            return;
        }else {
            for (int i = 0; i <= membersInt; i++) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Введите имя");
                String nameAndSurname = sc.nextLine();
                System.out.println("Введите возраст");
                int year = sc.nextInt();
                members.add(new MusicArtist(nameAndSurname,year));
            }
        }
    }

    public void deleteMembers(){
        System.out.println("Сколько вы хотите удалить участников?");
        Scanner sc = new Scanner(System.in);
        int memdel = sc.nextInt();
        if(memdel<=0){
            return;
        } else {
            for (int i = 0; i <= memdel; i++) {
                System.out.println("Какого по счету участника вы хотите удалить?");
                int memnum = sc.nextInt();
                members.remove(memnum);
                System.out.println(members.get(memnum) + " Удален!");
            }
        }
    }

    public static void transferMembers(MusicBand musicBand1, MusicBand musicBand2){
        musicBand1.members.addAll(musicBand2.members);
        musicBand2.members.removeAll(musicBand2.members);
        System.out.println("Из "+musicBand2+" все перешли в "+musicBand1);
    }

    public void printMembers(){
        System.out.println(toString()+" "+members);
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
}


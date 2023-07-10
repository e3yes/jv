package Day12.Task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MusicBand {

    Scanner sc = new Scanner(System.in);
    private String name;
    private int year;

    List<String> members = new ArrayList<>();

    public MusicBand(String name, int year){
        this.name = name;
        this.year = year;
    }
    public String toString(){
        return "Name = "+name+" Year = "+year;
    }

    public void addMembers(){
        System.out.println("Сколько участников вы хотите добавить");
        int membersInt = sc.nextInt();
        if(membersInt<=0){
            return;
        }else {
            for (int i = 0; i <= membersInt; i++) {
                System.out.println("Введите имя и фамилию участника одной строкой");
                String nameAndSurname = sc.nextLine();
                members.add(nameAndSurname);
            }
        }
    }

    public void deleteMembers(){
        System.out.println("Сколько вы хотите удалить участников?");
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
        System.out.println(members);
    }

    public List<String> getMembers() {
        return members;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
}


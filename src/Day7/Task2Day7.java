package Day7;
import java.util.Scanner;
import java.util.Random;
public class Task2Day7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        Player plr1 = new Player("Player1", rand.nextInt(89,99));
        Player plr2 = new Player("Player2", rand.nextInt(89,99));
        Player plr3 = new Player("Player3", rand.nextInt(89,99));
        Player plr4 = new Player("Player4", rand.nextInt(89,99));
        Player plr5 = new Player("Player5", rand.nextInt(89,99));
        Player plr6 = new Player("Player6", rand.nextInt(89,99));
        plr1.info();
        System.out.println("Стамина у "+plr3.name+" = "+plr3.getStamina());
        for(int i=0;i<=8;i++){
            plr3.run();
        }
        plr3.info();
        System.out.println(plr1.getCountPlayers());
        System.out.println(plr3.getStamina());


    }
}
class Player{
    public int stamina;

    public String name;
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;

    public static int countPlayers = 0;

    public Player(String name, int stamina){
        this.stamina = stamina;
        this.name = name;
        countPlayers++;
    }

    public void run(){
        if (stamina>10){
            stamina-=10;
            System.out.println(name+" Бежит, осталось стамины = "+stamina);
        }else {
            System.out.println(name+" устал и у него кончилась выносливость");
        }
    }

    public void info(){
        int f = 6 - countPlayers;
        if(countPlayers<6){
            System.out.println("Команды неполные. На поле еще есть "+f+" свободных мест");
        } else {
            System.out.println("На поле нет мест, 6 игроков на поле");
        }
    }

    public int getStamina(){
        return stamina;
    }
    public int getCountPlayers(){
        return countPlayers;
    }


}

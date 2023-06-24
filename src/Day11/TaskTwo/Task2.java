package Day11.TaskTwo;

import Day11.TaskTwo.Heroes.Magician;
import Day11.TaskTwo.Heroes.Paladin;
import Day11.TaskTwo.Heroes.Shaman;
import Day11.TaskTwo.Heroes.Warrior;

public class Task2 {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Paladin paladin = new Paladin();
        Magician magician = new Magician();
        Shaman shaman = new Shaman();

        warrior.physicalAttack(paladin);
        System.out.println(paladin);
        paladin.physicalAttack(magician);
        System.out.println(magician);
        shaman.healTeammate(magician);
        System.out.println(magician);
        magician.magicalAttack(paladin);
        System.out.println(paladin);
        shaman.physicalAttack(warrior);
        System.out.println(warrior);
        paladin.healHimself();
        System.out.println(paladin);
        System.out.println();
        for(int i=0;i<=5;i++){
            warrior.physicalAttack(magician);
        }
    }
}

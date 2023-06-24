package Day11.TaskTwo.Heroes;

import Day11.TaskTwo.Healer;
import Day11.TaskTwo.Hero;
import Day11.TaskTwo.PhysAttack;

public class Paladin extends Hero implements Healer, PhysAttack {

    public Paladin(){
        this.health = 100;
        this.physDef = 0.5;
        this.magicDef = 0.2;
        this.physAtt = 15;
        this.magicAtt = 0;
    }

    public String toString(){
        return "|Paladin, Health = "+health+"|";
    }
    @Override
    public void healHimself() {
        System.out.println("Paladin Захилился на 25 единиц");
        health+=25;
    }

    @Override
    public void healTeammate(Hero hero) {
        System.out.println("Paladin Захилил "+hero+" на 10 единиц");
        hero.health+=10;
    }

    @Override
    public void physicalAttack(Hero hero) {
        if(hero.health > 0) {
            double damage = 0;
            damage = (this.physAtt - this.physAtt * hero.physDef);
            System.out.println("Paladin attack " + hero + " On " + damage + " damage");
            hero.health -= damage;
        } else {
            System.out.println(hero+" Умер");
        }
    }
}

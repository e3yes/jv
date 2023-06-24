package Day11.TaskTwo.Heroes;

import Day11.TaskTwo.Hero;
import Day11.TaskTwo.PhysAttack;

public class Warrior extends Hero implements PhysAttack {

    public Warrior(){
        this.health = 100;
        this.physDef = 0.8;
        this.magicDef = 0;
        this.physAtt = 30;
        this.magicAtt = 0;
    }

    public String toString(){
        return "|Warrior, Health = "+health+"|";
    }
    @Override
    public void physicalAttack(Hero hero) {
        if(hero.health > 0) {
            double damage = 0;
            damage = (this.physAtt - this.physAtt * hero.physDef);
            System.out.println("Warrior attack " + hero + " On " + damage + " damage");
            hero.health -= damage;
        } else {
            System.out.println(hero+" Умер");
        }
    }
}

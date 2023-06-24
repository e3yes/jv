package Day11.TaskTwo.Heroes;

import Day11.TaskTwo.Hero;
import Day11.TaskTwo.MagicAttack;
import Day11.TaskTwo.PhysAttack;

public class Magician extends Hero implements PhysAttack, MagicAttack {

    public Magician(){
        this.health = 100;
        this.physDef = 0;
        this.magicDef = 0.8;
        this.physAtt = 5;
        this.magicAtt = 20;
    }

    public String toString(){
        return "|Magician, Health = "+health+"|";
    }
    @Override
    public void magicalAttack(Hero hero) {
        if(hero.health > 0) {
            double damage = 0;
            damage = (this.magicAtt - this.magicAtt * hero.magicDef);
            System.out.println("Magician attack " + hero + " On " + damage);
            hero.health -= damage;
        } else {
            System.out.println(hero+" Умер");
        }
    }

    @Override
    public void physicalAttack(Hero hero) {
        if(hero.health > 0) {
            double damage = 0;
            damage += (this.physAtt - this.physAtt * hero.physDef);
            System.out.println("Magician attack " + hero + " On " + damage + " damage");
            hero.health -= damage;
        } else {
            System.out.println(hero+" Умер");
        }
    }
}

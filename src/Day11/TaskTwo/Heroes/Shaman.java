package Day11.TaskTwo.Heroes;
import Day11.TaskTwo.Healer;
import Day11.TaskTwo.Hero;
import Day11.TaskTwo.MagicAttack;
import Day11.TaskTwo.PhysAttack;

public class Shaman extends Hero implements Healer, PhysAttack, MagicAttack {

    public Shaman(){
        this.health = 100;
        this.physDef = 0.2;
        this.magicDef = 0.2;
        this.physAtt = 10;
        this.magicAtt = 15;
    }

    public String toString(){
        return "|Shaman, Health = "+health+"|";
    }
    @Override
    public void healHimself() {
        System.out.println("Shaman Захилился на 50 единиц");
        health+=50;
    }

    @Override
    public void healTeammate(Hero hero) {
        System.out.println("Shaman Захилил "+hero+" на 30 единиц");
        hero.health+=30;
    }

    @Override
    public void magicalAttack(Hero hero) {
        if(hero.health > 0) {
            double damage = 0;
            damage = (this.magicAtt - this.magicAtt * hero.magicDef);
            System.out.println("Shaman attack " + hero + " On " + damage + " damage");
            hero.health -= damage;
        } else {
            System.out.println(hero+" Умер");
        }
    }

    @Override
    public void physicalAttack(Hero hero) {
        if(hero.health > 0) {
            double damage = 0;
            damage = (this.physAtt - this.physAtt * hero.physDef);
            System.out.println("Shaman attack " + hero + " On " + damage);
            hero.health -= damage;
        } else {
            System.out.println(" Умер");
        }
    }
}

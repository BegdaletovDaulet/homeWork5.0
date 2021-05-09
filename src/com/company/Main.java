package com.company;

public class Main {

    public static void main(String[] args){
    Boss boss = new Boss();

    boss.setHealthBoss(500);
    boss.setDamageBoss(100);
    boss.setProtection("Щит");

        System.out.println("Жизнь босса = " + boss.getHealthBoss() + ", урон босса = " + boss.getDamageBoss() + ", тип защиты босса "
        + boss.getProtection());

        System.out.println("_______________________________________");
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println(createHeroes()[i].getDamage());
        }
    }

    //дз на сооброзительность
    public static Hero[] createHeroes (){
    Hero captainAmerica = new Hero(200, 50);
    Hero superMan = new Hero(400,100);
    Hero spiderMan = new Hero(100,20);

    Hero[] heroes = {captainAmerica, superMan, spiderMan};
    return heroes;
    }
}

package day11.task2;

public class Paladin extends Hero implements Healer {
    public Paladin() {
        super.physAtt = 15;
        super.physDef = 50;
        super.magicDef = 20;
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }

    @Override
    public void healHimself() {
        health += 25;
        if (health > MAX_HEALTH) {
            health = MAX_HEALTH;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.health += 10;
        if (hero.health > MAX_HEALTH) {
            hero.health = MAX_HEALTH;
        }
    }
}

package day11.task2;

public abstract class Hero implements PhysAttack {

    final int MAX_HEALTH = 100;
    final int MIN_HEALTH = 0;
    protected int physDef;
    protected int magicDef;
    protected int physAtt;
    protected double health;

    public Hero() {
        this.health = MAX_HEALTH;
    }

    public void physicalAttack(Hero hero) {
        if (hero.health - (physAtt * (1 - (hero.physDef * 0.01))) < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health = hero.health - (physAtt * (1 - (hero.physDef * 0.01)));
        }
    }
}

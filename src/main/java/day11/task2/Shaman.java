package day11.task2;

public class Shaman extends Hero implements MagicAttack, Healer {
    private int magicAtt;

    public Shaman() {
        super.physAtt = 10;
        magicAtt = 15;
        super.physDef = 20;
        super.magicDef = 20;
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }

    @Override
    public void healHimself() {
        health += 50;
        if (health > MAX_HEALTH) {
            health = MAX_HEALTH;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.health += 30;
        if (hero.health > MAX_HEALTH) {
            hero.health = MAX_HEALTH;
        }
    }

    @Override
    public void magicalAttack(Hero hero) {
        if (hero.health - (magicAtt * (1 - (hero.magicDef * 0.01))) < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health = hero.health - (magicAtt * (1 - (hero.magicDef * 0.01)));
        }
    }
}

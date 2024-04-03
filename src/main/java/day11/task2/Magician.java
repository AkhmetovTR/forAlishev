package day11.task2;

public class Magician extends Hero implements MagicAttack {
    private int magicAtt;

    public Magician() {
        super.physAtt = 5;
        magicAtt = 20;
        super.physDef = 0;
        super.magicDef = 80;
    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
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

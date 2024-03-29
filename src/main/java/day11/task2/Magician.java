package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack {
    public Magician() {
        super.physAtt = 5;
        super.magicAtt = 20;
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
        hero.health = hero.health - (magicAtt *  (1-(hero.magicDef*0.01)));
        if (hero.health < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        }
    }
}

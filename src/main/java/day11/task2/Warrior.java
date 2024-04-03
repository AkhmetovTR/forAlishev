package day11.task2;

public class Warrior extends Hero {
    public Warrior() {
        super.physAtt = 30;
        super.physDef = 80;
        super.magicDef = 0;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                '}';
    }
}


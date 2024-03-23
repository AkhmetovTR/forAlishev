package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike1 = new Motorbike("ИЖ Планета 5", "Красный", 1990);
        System.out.println("Мотоцикл " + motorbike1.getModel() + " цвет " + motorbike1.getColor() + " год выпуска " + motorbike1.getYear());
    }
}

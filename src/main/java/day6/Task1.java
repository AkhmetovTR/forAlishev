package day6;

public class Task1 {
    public static void main(String[] args) {
    Car car1 = new Car();
    car1.setYear(2020);
    car1.setModel("Лада Приора");
    car1.setColor("Черный");
    car1.info();
        System.out.println("Разница между годами "+car1.yearDifference(2000));
        System.out.println("Разница между годами "+car1.yearDifference(2030));
    Motorbike motorbike1 = new Motorbike("ИЖ Юпитер 2","Синий",1990);
    motorbike1.info();
        System.out.println("Разница между годами "+motorbike1.yearDifference(1950));
        System.out.println("Разница между годами "+motorbike1.yearDifference(2000));

    }
}

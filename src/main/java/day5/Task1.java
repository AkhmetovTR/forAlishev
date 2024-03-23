package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setColor("Белый");
        car1.setModel("Лада Веста");
        car1.setYear(2020);
        System.out.println("Автомобиль " + car1.getModel() + " цвет " + car1.getColor() + " год выпуска " + car1.getYear());
    }
}

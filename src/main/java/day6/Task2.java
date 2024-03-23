package day6;

public class Task2 {
    public static void main(String[] args) {
    Airplane airplane1 = new Airplane("Авиастар-СП",1980,45,200);
    airplane1.info();
    airplane1.setYear(1990);
    airplane1.setLength(50);
    airplane1.fillUp(10);
    airplane1.info();
    airplane1.fillUp(33);
    airplane1.info();
    }
}

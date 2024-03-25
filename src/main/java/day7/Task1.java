package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplaneOne = new Airplane("УМПО",1990,45,200);
        Airplane airplaneTwo = new Airplane("Аэрофлот",2000,50,300);
        Airplane airplaneThree = new Airplane("Взлёт",2010,45,300);
        Airplane.compareAirplanes(airplaneOne,airplaneTwo);
        Airplane.compareAirplanes(airplaneOne,airplaneThree);
    }
}
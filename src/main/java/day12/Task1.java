package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("LADA");
        cars.add("SKODA");
        cars.add("DATSUN");
        cars.add("BMW");
        cars.add("AUDI");
        System.out.println(cars);
        cars.remove(2);
        System.out.println(cars);
        cars.add(3,"OMODA");
        System.out.println(cars);
        cars.remove(0);
        System.out.println(cars);
    }
}

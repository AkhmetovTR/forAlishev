package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        EvenNumbers(0, 30, numbers);
        System.out.println(numbers);
        EvenNumbers(300, 350, numbers);
        System.out.println(numbers);
    }

    public static void EvenNumbers(int start, int end, List<Integer> list) {
        for (int i = start; i < end; i++) {
            if (i % 2 == 0) {
                list.add(i);
            }

        }
    }
}

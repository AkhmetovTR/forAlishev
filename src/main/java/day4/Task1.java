package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int more8 = 0;
        int equal1 = 0;
        int even = 0;
        int odd = 0;
        int sumOfAll = 0;
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = (int) Math.round(Math.random() * 10);
            sumOfAll += numbers[i];
            if (numbers[i] > 8) {
                more8++;
            }
            if (numbers[i] == 1) {
                equal1++;
            }
            if (numbers[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        for (int s : numbers
        ) {
            System.out.println(s);
        }
        System.out.println("Длина массива: " + n);
        System.out.println("Количество чисел больше 8: " + more8);
        System.out.println("Количество чисел равных 1: " + equal1);
        System.out.println("Количество четных чисел: " + even);
        System.out.println("Количество нечетных чисел: " + odd);
        System.out.println("Сумма всех элементов массива: " + sumOfAll);
    }
}

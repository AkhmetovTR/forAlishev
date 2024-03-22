package day4;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int endZero = 0;
        int sumEndZero = 0;
        for (int i : numbers
        ) {
            i = (int) Math.round(Math.random() * 10000);
            if (i < min) {
                min = i;
            }
            ;
            if (i > max) {
                max = i;
            }
            if (i % 10 == 0) {
                endZero++;
                sumEndZero += i;
            }
        }
        System.out.println("Наибольшый элемент массива: " + max);
        System.out.println("Наименьщий элемент массива: " + min);
        System.out.println("Количество элементов оканчивабщихся на 0: " + endZero);
        System.out.println("Сумма элеметов массива заканчивающихся на 0: " + sumEndZero);
    }
}

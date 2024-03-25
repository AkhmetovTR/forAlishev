package day4;

public class Task4 {
    public static void main(String[] args) {
        int sumElem = 0;
        int maxSumElem = 0;
        int posElem = 0;
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) Math.round(Math.random() * 10000);
            System.out.println(numbers[i] + "  " + i);
        }
        for (int i = 0; i < numbers.length - 2; i++) {
            sumElem = 0;
            for (int j = 0; j < 3; j++) {
                sumElem += numbers[i + j];
            }
            if (maxSumElem < sumElem) {
                maxSumElem = sumElem;
                posElem = i;
            }
        }
        System.out.println(maxSumElem);
        System.out.println(posElem);
    }
}

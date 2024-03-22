package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean i = true;
        while (i) {
            double a = in.nextDouble();
            double b = in.nextDouble();
            if (b == 0) {
                i = false;
                break;
            }
            double result = a/b;
            System.out.println(result);
        }
    }
}

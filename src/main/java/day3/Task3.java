package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        double result;
        Scanner in = new Scanner(System.in);
        for(int i = 0; i<5;i++){
            double a = in.nextDouble();
            double b = in.nextDouble();
            if(b==0){
                System.out.println("Деление на 0");
                continue;
            } else {
                result = a/b;
                System.out.println(result);
            }

        }
    }
}

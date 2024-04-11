package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("fileNumbers.txt");
        printSumDigits(file);
    }

    public static void printSumDigits(File file) {
        int sum = 0;
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");
            if (numbersString.length != 10) {
                throw new IOException();
            }
            int[] numbers = new int[10];
            int counter = 0;
            for (String number : numbersString) {
                numbers[counter] = Integer.parseInt(number);
                sum += numbers[counter++];
            }
            System.out.println(sum);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
        }
    }
}

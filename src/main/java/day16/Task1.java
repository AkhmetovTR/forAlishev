package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("fileNumbers.txt");
        printResult(file);
    }

    public static void printResult(File file) {
        double average = 0;
        int sum = 0;

        try (Scanner scanner = new Scanner(file)){
            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");
            if (numbersString.length <= 0) {
                throw new IOException();
            }
            double[] numbers = new double[numbersString.length];
            int counter = 0;
            for (String number : numbersString) {
                numbers[counter] = Integer.parseInt(number);
                sum += numbers[counter++];
            }
            scanner.close();
            average = (double) sum / numbers.length;
            System.out.print(average + " --> ");
            System.out.printf("%.3f", average);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
        } catch (NumberFormatException e) {
            System.out.println("Вместо числа строка");
        }
    }
}

package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        randomThousandNumbers();
        String sepatator = File.separator;
        File file = new File("src" + sepatator + "main" + sepatator + "resources" + sepatator + "file1.txt");
        avarageForTwentyNumbers(file);
        File file2 = new File("src" + sepatator + "main" + sepatator + "resources" + sepatator + "file2.txt");
        printResult(file2);
    }

    public static void randomThousandNumbers() {
        final int QUANTITY = 1000;
        String sepatator = File.separator;
        Random randomNumber = new Random();
        try {
            PrintWriter printWriter = new PrintWriter("src" + sepatator + "main" + sepatator + "resources" + sepatator + "file1.txt");
            for (int i = 0; i < QUANTITY; i++) {
                printWriter.print(randomNumber.nextInt(101) + " ");
            }
            printWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }

    public static void avarageForTwentyNumbers(File file) {
        double average = 0;
        int sum = 0;
        try(Scanner scanner = new Scanner(file)) {
            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");
            String sepatator = File.separator;
            PrintWriter printWriter = new PrintWriter("src" + sepatator + "main" + sepatator + "resources" + sepatator + "file2.txt");
            if (numbersString.length <= 0 || numbersString.length % 20 != 0) {
                throw new IOException();
            }
            double[] numbers = new double[numbersString.length];
            int counter = 0;
            int counter20 = 1;
            for (String number : numbersString) {
                numbers[counter] = Double.parseDouble(number);
                sum += numbers[counter++];
                if (counter20 == 20) {
                    average = (double) sum / counter20;
                    printWriter.print(average + " ");
                    sum = 0;
                    counter20 = 0;
                }
                counter20++;
            }
            printWriter.close();
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
        } catch (NumberFormatException e) {
            System.out.println("Вместо числа строка");
        }
    }

    public static void printResult(File file) {
        double sum = 0;
        try(Scanner scanner = new Scanner(file);) {

            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");
            if (numbersString.length <= 0) {
                throw new IOException();
            }
            double[] numbers = new double[numbersString.length];
            int counter = 0;
            for (String number : numbersString) {
                numbers[counter] = Double.parseDouble(number);
                sum += numbers[counter++];
            }
            scanner.close();
            System.out.println((int) sum);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
        } catch (NumberFormatException e) {
            System.out.println("Вместо числа строка");
        }
    }
}

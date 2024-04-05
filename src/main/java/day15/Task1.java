package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String sepatator = File.separator;
        File fileIn = new File("src" + sepatator + "main" + sepatator + "resources" + sepatator + "shoes.csv");
        Scanner scanner = null;
        int quantity;
        int size;
        try {
            scanner = new Scanner(fileIn);
            PrintWriter printWriter = new PrintWriter("src" + sepatator + "main" + sepatator + "resources" + sepatator + "missing_shoes.txt");
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] stringData = line.split(";");
                if (stringData.length != 3) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                size = Integer.parseInt(stringData[1]);
                quantity = Integer.parseInt(stringData[2]);

                if (quantity < 0 || size < 0) {
                    throw new IOException();
                }
                if (quantity == 0) {
                    printWriter.println(line);
                }

            }
            scanner.close();
            printWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Некорректный входной файл, отрицательное число");
        } catch (NumberFormatException e) {
            System.out.println("Вместо числа указана строка");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Колличество столбцов не равно 3");
        }
    }
}

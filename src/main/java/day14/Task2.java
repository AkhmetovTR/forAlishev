package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("people.txt");
        System.out.println(parseFileToStringList(file));
    }

    public static List<String> parseFileToStringList(File file) {
        Scanner scanner = null;
        int age;
        List<String> nameAndAge = new ArrayList<>();
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] peopleString = line.split(" ");
                age = Integer.parseInt(peopleString[1]);
                if (age < 0) {
                    throw new IOException();
                }
                nameAndAge.add(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
            return null;
        } catch (NumberFormatException e) {
            System.out.println("Вместо возраста указана строка");
            return null;
        }
        return nameAndAge;
    }
}

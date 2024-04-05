package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people.txt");
        System.out.println(parseFileToObjList(file));
    }

    public static List<Person> parseFileToObjList(File file) {
        Scanner scanner = null;
        int age;
        List<Person> persons = new ArrayList<>();
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] peopleString = line.split(" ");
                age = Integer.parseInt(peopleString[1]);
                if (age < 0) {
                    throw new IOException();
                }
                persons.add(new Person(peopleString[0], age));
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
        return persons;
    }
}

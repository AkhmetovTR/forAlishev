package day8;

public class Task1 {
    public static void main(String[] args) {
        String stringSpace = " ";
        String stringAll = "";
        StringBuilder sb = new StringBuilder();

        long startTime = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            stringAll = stringAll + stringSpace + i;
        }
        long stopTime = System.currentTimeMillis();
        System.out.println(stringAll);

        long startTimeSB = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            sb.append(i + " ");
        }
        long stopTimeSB = System.currentTimeMillis();
        System.out.println(sb);
        System.out.println("Использование строк");
        System.out.println("Длительность работы, в мс.: " + (stopTime - startTime));
        System.out.println("Использование StringBuilder");
        System.out.println("Длительность работы, в мс.: " + (stopTimeSB - startTimeSB));

    }
}

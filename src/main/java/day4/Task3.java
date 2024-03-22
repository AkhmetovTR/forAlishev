package day4;

public class Task3 {
    public static void main(String[] args) {
        int m = 12;
        int n = 8;
        int maxSummInLine = 0;
        int numberLine = 0;
        int[][] numbers = new int[m][n];
        for (int i = 0; i < m; i++) {
            int newMaxSumLine = 0;
            for (int j = 0; j < n; j++) {
                numbers[i][j] = (int) Math.round(Math.random() * 50);
                newMaxSumLine += numbers[i][j];
            }
            if (maxSummInLine < newMaxSumLine) {
                maxSummInLine = newMaxSumLine;
                numberLine = i;
            }
        }
        System.out.println("Индекс строки с максимальной суммой: " + numberLine);
    }
}

package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        Player player1 = new Player(random.nextInt(11) + 90);
        Player player2 = new Player(random.nextInt(11) + 90);
        Player player3 = new Player(random.nextInt(11) + 90);
        Player player4 = new Player(random.nextInt(11) + 90);
        Player.info();
        System.out.println("Количество игроков на поле " + Player.getCountPlayers());
        Player player5 = new Player(random.nextInt(11) + 90);
        Player player6 = new Player(random.nextInt(11) + 90);
        System.out.println("Количество игроков на поле " + Player.getCountPlayers());
        Player.info();
        Player player7 = new Player(random.nextInt(11) + 90);
        System.out.println("Количество игроков на поле " + Player.getCountPlayers());
        Player.info();
        for (int i = 0; i < 150; i++) {
            player7.run();
        }
        System.out.println("Количество игроков на поле " + Player.getCountPlayers());
        Player.info();


    }
}

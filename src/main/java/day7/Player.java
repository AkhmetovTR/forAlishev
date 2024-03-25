package day7;

public class Player {
    private int stamina;
    final int MAX_STAMINA = 100;
    final int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    void run() {
        if (stamina >= 1) {
            stamina--;
            if (stamina == MIN_STAMINA) {
                countPlayers--;
            }
        }

    }

    static void info() {
        if (countPlayers == 6) {
            System.out.println("На поле нет свободных мест");
        } else {
            int freePlace = 6 - countPlayers;
            String place = "";
            switch (freePlace) {
                case 1:
                    place = " свободное место ";
                    break;
                case 2:
                case 3:
                case 4:
                    place = " свободных места ";
                    break;
                default:
                    place = " свободных мест ";
                    break;
            }
            System.out.println("Команды не полные. На поле еще есть " + freePlace + place);


        }
    }
}

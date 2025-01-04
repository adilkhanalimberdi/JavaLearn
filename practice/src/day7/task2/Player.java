package day7.task2;

import java.util.Random;

public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    static int countPlayers = 0;
    private Random rand = new Random();

    public Player() {
        int stamina = rand.nextInt(11) + 90;
        this.stamina = stamina;

        if (countPlayers < 6)
            countPlayers++;
    }

    public Player(int stamina) {
        this.stamina = stamina;
    }

    public void run() {
        if (stamina > 0) {
            stamina--;
            if (stamina == 0)
                countPlayers--;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public static void info() {
        if (countPlayers >= 6) {
            System.out.println("There are no free places on the field");
        } else if (countPlayers < 6) {
            System.out.println("Teams are not full. There are " + (6 - countPlayers) + " free places on the field");
        }
    }
}

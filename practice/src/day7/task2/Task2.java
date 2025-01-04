package day7.task2;

public class Task2 {

    public static void main(String[] args) {
        Player.info();

        Player p1 = new Player(90);
        Player p2 = new Player();
        Player p3 = new Player();

        Player.info();

        Player p4 = new Player();
        Player p5 = new Player();
        Player p6 = new Player();
        Player p7 = new Player();
        Player p8 = new Player();

        Player.info();
        System.out.println("Number of players: " + Player.countPlayers);

        System.out.println(p1.getStamina());
        System.out.println(p2.getStamina());

        for (int i = 0; i < 90; i++) p1.run();

        System.out.println(p1.getStamina());
        System.out.println("Number of players: " + Player.countPlayers);

        Player.info();
        Player p9 = new Player();
        Player.info();
    }

}

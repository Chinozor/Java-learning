package p303n15;

import java.util.Random;

public class Dice implements Game {
    Random random = new Random();
    int i;
    @Override
    public void toss() {
        i = random.nextInt(6) + 1;
        System.out.println("Your number is " + i);
    }
    public static GameFactory gameFactory = new GameFactory() {
        @Override
        public Game getGame() {
            return new Dice();
        }
    };
}

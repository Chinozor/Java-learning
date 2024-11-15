package p303n15;

import java.util.Random;

public class Coin implements Game {
    Random random = new Random();
    int i;
    @Override
    public void toss() {
        i = random.nextInt();
        if (i == 0)
            System.out.println("Tails");
        else
            System.out.println("Heads");
    }
    public static GameFactory gameFactory = new GameFactory() {
        @Override
        public Game getGame() {
            return new Coin();
        }
    };
}

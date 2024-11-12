package p287n19;

import java.util.Random;

public class Dice implements Game{
    Random random = new Random();
    int i;
    @Override
    public void toss() {
        i = random.nextInt(6) + 1;
        System.out.println("Your number is " + i);
    }
}
class DiceFactory implements GameFactory {
    @Override
    public Game getGame() {
        return new Dice();
    }
}

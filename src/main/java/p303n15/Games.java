package p303n15;

public class Games {
    public static void playGame(GameFactory factory){
        Game s = factory.getGame();
        s.toss();
    }

    public static void main(String[] args) {
        playGame(Coin.gameFactory);
        playGame(Dice.gameFactory);
    }
}

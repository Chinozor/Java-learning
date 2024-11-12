package p287n19;

public class Games {
    public static void playGame(GameFactory factory){
        Game s = factory.getGame();
        s.toss();
    }

    public static void main(String[] args) {
        playGame(new CoinFactory());
        playGame(new DiceFactory());
    }
}
//ну в целом прикольно, но я не понимаю почему это жизненно необходимо
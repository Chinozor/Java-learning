package p301n10;

public class Main {
    public Game game(){
        return new Game() {
            @Override
            public void play() {
                System.out.println("play");
            }
        };
    }

    public static void main(String[] args) {
        Main main = new Main();
        Game chess = main.game();
        chess.play();
    }
}

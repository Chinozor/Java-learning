package p266n2;

public abstract class Main {
    void play(){
        System.out.println("Play");
    };
    Main(){
        System.out.println("Main");
    }
    void game(){
        System.out.println("Game");
    }

    public static void main(String[] args) {
        Main main = new Main();
    }
}

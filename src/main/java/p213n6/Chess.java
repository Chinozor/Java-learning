package p213n6;

public class Chess extends BoardGames {
    Chess(){
        super(11);
        System.out.println("Конструктор Chess");
    }

    public static void main(String[] args) {
        Chess x =  new Chess();
    }
}

package p225n17;

public class Frog extends Amphibian {
    static void voice(Amphibian amphibian){
        System.out.println("QwWa");
    }
    static void move(Amphibian amphibian){
        System.out.println("jump");
    }
    public static void main(String[] args) {
        Frog qwa = new Frog();
        Amphibian.move(qwa);
        Amphibian.voice(qwa);
        voice(qwa);
        move(qwa);
    }
}

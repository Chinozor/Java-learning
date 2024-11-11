package p255n15;

public class Rodent {
    private static int count = 0;
    private final int id = count++;
    Rodent() {
        System.out.println("Я грызун" + id);
    }
    private Voice voice = new Voice("Я не говорю");
    private Eat eat = new Eat("Я ем все");
}


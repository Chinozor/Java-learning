package p254n12;

public class Rodent {
    Rodent() {
        System.out.println("Я грызун");
    }
    private  Voice voice = new Voice("Я не говорю");
    private Eat eat = new Eat("Я ем все");
}


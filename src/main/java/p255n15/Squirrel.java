package p255n15;

class Squirrel extends Rodent {
    private static int count = 0;
    private final int id = count++;
    Squirrel(){
        System.out.println("Я белка" + id);
    }
    private Voice voice = new Voice("Я убегаю");
    private Eat eat = new Eat("Я ем орехи");
}

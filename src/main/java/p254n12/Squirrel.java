package p254n12;

class Squirrel extends Rodent {
    Squirrel(){
        System.out.println("Я белка");
    }
    private  Voice voice = new Voice("Я убегаю");
    private Eat eat = new Eat("Я ем орехи");
}

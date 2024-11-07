package p254n12;

class Squirrel extends Rodent {
    Squirrel(){
        System.out.println("Я белка");
    }
    @Override
    void eat() {
        System.out.println("Я ем орехи");
    }

    @Override
    public String toString() {
        return "Я белка";
    }

    @Override
    void voice() {
        System.out.println("Я как слышу звук убегаю");
    }
}

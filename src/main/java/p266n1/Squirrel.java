package p266n1;

class Squirrel extends Rodent {
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

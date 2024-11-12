package p269n7;

class Squirrel implements Rodent {
    @Override
    public void eat() {
        System.out.println("Я ем орехи");
    }

    @Override
    public String toString() {
        return "Я белка";
    }

    @Override
    public void voice() {
        System.out.println("Я как слышу звук убегаю");
    }
}

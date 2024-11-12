package p287n18;

public class Bicycle implements Cycle {
    int numberWheel = 2;

    @Override
    public void move() {
        System.out.println("Ногами))");
    }

    @Override
    public void numberWheel() {
        System.out.println("У меня " + numberWheel + " колеса.");
    }
}
class BicycleFabric implements CycleFactory{
    @Override
    public Cycle getCycle() {
        return new Bicycle();
    }
}

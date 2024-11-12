package p287n18;

public class Unicycle implements Cycle {
    int numberWheel = 1;

    @Override
    public void move() {
        System.out.println("Ногами");
    }

    @Override
    public void numberWheel() {
        System.out.println("У меня " + numberWheel + " колесо.");
    }
}
class UnicycleFabric implements CycleFactory{
    @Override
    public Cycle getCycle() {
        return new Unicycle();
    }
}
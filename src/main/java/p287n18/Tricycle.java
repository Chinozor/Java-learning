package p287n18;

public class Tricycle implements Cycle {
    int numberWheel = 2;

    @Override
    public void move() {
        System.out.println("Ногами)))");
    }

    @Override
    public void numberWheel() {
        System.out.println("У меня " + numberWheel + " колеса.");
    }
}
class TricycleFabric implements CycleFactory{
    @Override
    public Cycle getCycle() {
        return new Tricycle();
    }
}
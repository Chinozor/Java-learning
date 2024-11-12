package p287n18;

public interface Cycle {
    void move();
    void numberWheel();
}
interface CycleFactory{
    Cycle getCycle();
}

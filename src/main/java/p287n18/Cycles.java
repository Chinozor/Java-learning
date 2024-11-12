package p287n18;

public class Cycles {
    public static void cycles(CycleFactory factory){
        Cycle c = factory.getCycle();
        c.move();
        c.numberWheel();
    }

    public static void main(String[] args) {
        cycles(new BicycleFabric());
        cycles(new TricycleFabric());
        cycles(new UnicycleFabric());
    }
}
//Чувствую, что супер рабочая штука, но лучше еще разочек ее разобрать.
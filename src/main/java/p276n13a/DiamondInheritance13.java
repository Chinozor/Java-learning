package p276n13a;

interface CanDo {
    void doIt();
}

interface CanDoMore extends CanDo {
    void doMore();
}

interface CanDoFaster extends CanDo {
    void doFaster();
}

interface CanDoMost extends CanDoMore, CanDoFaster {
    void doMost();
}

class Doer implements CanDoMost {
    public void doIt() {}
    public void doMore() {}
    public void doFaster() {}
    public void doMost() {}
}

public class DiamondInheritance13 {
    public static void main(String[] args) {
        Doer d = new Doer();
        ((CanDoMore)d).doMore();
        ((CanDoFaster)d).doFaster();
        ((CanDo)d).doIt();
    }
}
//Зачем делать второй класс и делать нисходящее преобразование, а не сделать просто как у меня???

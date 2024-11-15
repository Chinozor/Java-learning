package p309n21;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        A a4 = new A();
        A a5 = new A();
        B b = new B();
        b.save(a.u());
        b.save(a1.u());
        b.save(a2.u());
        b.save(a3.u());
        b.save(a4.u());
        b.save(a5.u());
        b.makeNull(1);
        b.doThis();
    }
}

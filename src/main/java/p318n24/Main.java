package p318n24;

public class Main {
    class Inner2 extends Outer.Inner {
        Inner2(Outer outer, int i) {
            outer.super(i);
        }
    }
}

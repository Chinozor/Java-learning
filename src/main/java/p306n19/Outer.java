package p306n19;

public interface Outer {
    void newI();
    void newS();
    void newB();
    class Inner implements Outer{
        @Override
        public void newI() {
            System.out.println("I");
        }

        @Override
        public void newS() {
            System.out.println("S");
        }

        @Override
        public void newB() {
            System.out.println("B");
        }

        public static void main(String[] args) {
            Outer outer = new Outer.Inner();
            outer.newB();
            outer.newI();
            outer.newS();
        }

    }
}

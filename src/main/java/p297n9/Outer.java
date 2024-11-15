package p297n9;

public class Outer {
    private class Inner implements Inter{
        @Override
        public void qwe() {
            System.out.println("QWE");
        }
        public void rty(){
            System.out.println("RTY");
        }
    }
    Inter inner(){
        return new Inner();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Inner inner = outer.new Inner();
        inner.qwe();
        inner.rty();
    }
}
//Мне кажется я что-то не то сделал.


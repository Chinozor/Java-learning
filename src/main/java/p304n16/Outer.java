package p304n16;

public class Outer {
    static class Inner{
        void prtint(){
            System.out.println("Inner");
        }
    }

    public static void main(String[] args) {
        Inner inner = new Inner();
        inner.prtint();
    }
}

package p295n8;

public class Outer {
    static class Inner{
        private int i = 10;
        private int ii = 1010;
        private int i10 = 100;
    }
    static int inner = new Inner().i;
    static int inn = new Inner().i10;
    static int in = new Inner().ii;

    public static void main(String[] args) {
        System.out.println(inner);
        System.out.println(in);
        System.out.println(inn);
    }

}

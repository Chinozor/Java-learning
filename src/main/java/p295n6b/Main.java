package p295n6b;
import p295n6.Inter;
import p295n6a.Outer;

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Inter inter = outer.inter();
        System.out.println(inter.avt());
    }
}

package p297n7;

public class Outer {
    public Inter inter(){
        class Inner implements Inter{

            @Override
            public void print() {
                System.out.println("Inter");
            }
        }
        return new Inner();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Inter inter = outer.inter();
        inter.print();
    }
}

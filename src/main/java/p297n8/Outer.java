package p297n8;

import p297n7.Inter;

public class Outer {
    public void inter(boolean b){
        if (b){
            class Inner implements Inter{

                @Override
                public void print() {
                    System.out.println("Inter");
                }
            }
        }
    }

    public static void main(String[] args) {
        p297n7.Outer outer = new p297n7.Outer();
        Inter inter = outer.inter();
        inter.print();
    }
}
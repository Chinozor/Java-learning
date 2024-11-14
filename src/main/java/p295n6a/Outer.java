package p295n6a;

import p295n6.Inter;

public class Outer {
    protected class Inner implements Inter {
        @Override
        public String avt() {
            System.out.println("Inter,Outer,Inner");
            return null;
        }
    }
    public Inter inter(){
        return new Inner();
    }
}

package p301n11;

public class Outer {
   private Inter inter(){
       return new Inter() {
           @Override
           public void qwe() {
               System.out.println("QWE");
           }
           public void rty(){
               System.out.println("RTY");
           }
       };
   }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Inter inter = outer.inter();
        inter.qwe();
        //inter.rty();
    }
}
//Почему он не видит метод rty? А в номере 9 видит.


package p93n7;

public class p93n7 {
    public static void main(String[] args) {
        StaticTest mySize = new StaticTest();
        StaticTest mySizeFuture = new StaticTest();
        Incrmentable.increment();
        System.out.println(mySizeFuture.my + " " + " "  + mySizeFuture.size);
        System.out.println(mySize.my + " " + " "  + mySize.size);
    }
}
class Incrmentable{
    static void increment(){
        StaticTest.size++;
    }
}
class StaticTest{
    static  int size = 180;
    static String my = "Мой рост";
}

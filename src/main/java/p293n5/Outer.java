package p293n5;

public class Outer {
    Outer(){
        System.out.println("Outer");
    }
    class Inner{
        Inner(){
            System.out.println("Inner");
        }
    }
}

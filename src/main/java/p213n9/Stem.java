package p213n9;

public class Stem extends Root {
    Stem m = new Stem();
    Component1 c1Stem;
    Component2 c2Stem;
    Component3 c3Stem;
    Stem(){
        System.out.println("Stem()");
    }
    public static void main(String[] args) {
        Stem s = new Stem();
    }
}

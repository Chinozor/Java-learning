package p213n10;

public class Stem extends Root {
    Stem m = new Stem(14);
    Component1 c1Stem;
    Component2 c2Stem;
    Component3 c3Stem;
    Stem(int i){
        System.out.println("Stem()");
        super(i);
    }
    public static void main(String[] args) {
        Stem s = new Stem(15);
    }
}

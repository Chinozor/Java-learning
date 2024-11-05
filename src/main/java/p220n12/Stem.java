package p220n12;

public class Stem extends Root {
    Component1 c1Stem;
    Component2 c2Stem;
    Component3 c3Stem;
    Stem(){
        System.out.println("Stem()");
    }
    void dispose(){
        System.out.println("Завершение " + "Stem 1()");
        super.dispose();
    }
    public static void main(String[] args) {
        Stem s = new Stem();
        s.dispose();
    }

}

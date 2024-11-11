package p258n16;
class Glyph{
    void  draw(){
        System.out.println("Glyph.draw()");
    }
    Glyph(){
        System.out.println("Glyph() перед вызовом draw()");
        draw();
        System.out.println("Glyph() после вызова draw()");
    }
}
class RoundGlyph extends Glyph{
    private int radius = 1;
    RoundGlyph(int r){
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }
    void draw(){
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}
class RectangleGlyph extends Glyph{
    private int radius = 1;
    RectangleGlyph(int r){
        radius = r;
        System.out.println("RectangleGlyph.RectangleGlyph(), radius = " + radius);
    }
    void draw(){
        System.out.println("RectangleGlyph.draw(), radius = " + radius);
    }
}

public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
        new RectangleGlyph(7);
    }
}
//Почему так работает?
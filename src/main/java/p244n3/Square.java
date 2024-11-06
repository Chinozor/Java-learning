package p244n3;

public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Square.draw()");
        super.draw();
    }
    @Override
    public void erase() {
        System.out.println("Square.erase()");
    }

    @Override
    public void print() {
        System.out.println("Square.print()");
    }
}

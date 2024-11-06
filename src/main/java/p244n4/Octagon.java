package p244n4;

public class Octagon extends Shape{
    @Override
    public void print() {
        System.out.println("octagon.print()");
        super.print();
    }

    @Override
    public void draw() {
        System.out.println("octagon.draw()");
        super.draw();
    }

    @Override
    public void erase() {
        System.out.println("octagon.erase()");
        super.erase();
    }
}

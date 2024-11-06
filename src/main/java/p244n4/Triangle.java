package p244n4;

public class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Triangle.draw()");
    }
    public void erase(){
        System.out.println("Triangle.erase()");
    }

    @Override
    public void print() {
        System.out.println("Triangle.print()");
    }
}

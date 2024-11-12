package p269n5a;

import p269n5.Dog;

public class Puppy implements Dog {
    @Override
    public void voice() {
        System.out.println("Auuuu");
    }

    @Override
    public void move() {
        System.out.println("I can move in three cavities");

    }

    @Override
    public void bark() {
        System.out.println("BARK-BARK");
    }

    public static void main(String[] args) {
        Puppy bulb = new Puppy();
        bulb.bark();
        bulb.move();
        bulb.voice();
    }
}

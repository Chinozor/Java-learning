package p244n5;

import java.util.Random;

public class Cycle {
    static Random random = new Random();
    public Integer  wheel(){
        System.out.println("***");
        return 3;
    }
    static public void ride(Cycle c){
        c.wheel();
        c.get();
    }
    public void get() {
        System.out.println("Cycle");
    }

    public static void main(String[] args) {
        Unicycle u = new Unicycle();
        Bicycle b = new Bicycle();
        Tricycle t = new Tricycle();
        ride(u);
        ride(b);
        ride(t);
    }
}
class Unicycle extends Cycle{
    int i = 0;
    @Override
    public void get(){
        System.out.println("Unicycle");
    }

    @Override
    public Integer wheel() {
        System.out.println("У одноколесного велосипеда 1 колеса");
        return 1;
    }
}
class Bicycle extends Cycle{
    int i = 1;
    @Override
    public void get(){
        System.out.println("Bicycle");
    }

    @Override
    public Integer wheel() {
        System.out.println("У велосипеда 2 колеса");
        return 2;
    }
}
class Tricycle extends Cycle{
    int i = 2;
    @Override
    public void get(){
        System.out.println("Tricycle");
    }

    @Override
    public Integer wheel() {
        System.out.println("У трехколесного велосипеда 3 колеса");
        return 3;
    }
}
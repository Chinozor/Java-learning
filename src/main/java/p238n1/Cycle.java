package p238n1;

public class Cycle {
    static public void ride(Cycle c){
        c.get();
    }
    public void get() {
        System.out.println("Cycle");
    }

    public static void main(String[] args) {
        Cycle u = new Unicycle();
        Cycle b = new Bicycle();
        Cycle t = new Tricycle();
        ride(u);
        ride(b);
        ride(t);
    }
}
class Unicycle extends Cycle{
    @Override
    public void get(){
        System.out.println("Unicycle");
    }
}
class Bicycle extends Cycle{
    @Override
    public void get(){
        System.out.println("Bicycle");
    }
}
class Tricycle extends Cycle{
    @Override
    public void get(){
        System.out.println("Tricycle");
    }
}
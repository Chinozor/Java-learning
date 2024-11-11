package p261n18;

public class Cycle {
    static public void ride(Cycle c){
        c.get();
    }
    public void get() {
        System.out.println("Cycle");
    }

    public static void main(String[] args) {
        Cycle[] abt = {
                new Unicycle(), new Bicycle(), new Tricycle()
        };
        ((Unicycle)abt[0]).balance();
        ((Bicycle)abt[1]).balance();
        ((Unicycle)abt[2]).balance();
    }
}
class Unicycle extends Cycle{
    @Override
    public void get(){
        System.out.println("Unicycle");
    }
    public void balance(){
        System.out.println("very hard");
    }
}
class Bicycle extends Cycle{
    @Override
    public void get(){
        System.out.println("Bicycle");
    }
    public void balance(){
        System.out.println("normal");
    }
}
class Tricycle extends Cycle{
    @Override
    public void get(){
        System.out.println("Tricycle");
    }
}
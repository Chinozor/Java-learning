package p223n15;

public class Car {
    protected void removeEngine(){
        System.out.println("Изъять двигатель");
    }
}
class Human{
    public static void main(String[] args) {
        Car i = new Car();
        i.removeEngine();
    }

}

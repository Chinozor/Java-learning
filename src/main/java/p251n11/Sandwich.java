package p251n11;

class Meal {
    Meal(){
        System.out.println("Meal");
    }
}
class Bread{
    Bread(){
        System.out.println("Bread");
    }
}
class Cheese{
    Cheese(){
        System.out.println("Cheese");
    }
}
class Lettuce{
    Lettuce(){
        System.out.println("Lettuce");
    }
}
class Pickle{
    Pickle(){
        System.out.println("Pickle");
    }
}
class Lunch extends Meal{
    Lunch(){
        System.out.println("Lunch");
    }
}
class PortableLunch extends Lunch{
    PortableLunch(){
        System.out.println("PortableLunch");
    }
}
public class Sandwich extends PortableLunch{
    private Bread b = new Bread();
    private Cheese cheese = new Cheese();
    private Pickle pickle = new Pickle();
    private Lettuce lettuce = new Lettuce();


    public static void main(String[] args) {
        new Sandwich();
    }
}

package p269n8;

class Meal{
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
public class Sandwich extends PortableLunch implements FastFood{
    public static void main(String[] args) {
        Sandwich sandwich = new Sandwich();
        sandwich.burgers();
        sandwich.cola();
        sandwich.sandwich();
    }

    @Override
    public void burgers() {
        System.out.println("make burger");
    }

    @Override
    public void sandwich() {
        new Bread();
        new Cheese();
        new Pickle();
        new Lettuce();
    }

    @Override
    public void cola() {
        System.out.println("Coca-cola");
    }
}

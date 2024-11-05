package p221n13;

public class Bulb extends Dog {
    void bark(int i){
        System.out.println("ГАВ-ГАВ");
    }

    public static void main(String[] args) {
         Bulb bulby = new Bulb();
         bulby.bark("гав");
         bulby.bark("гав", "uf");
         bulby.bark();
         bulby.bark(3);
    }
}

package p172n13;

public class Main {
    public static void main(String[] args) {
        StreetDogs.simon.print();
        Dog simon = new Dog(12);
    }
}
class Dog{
    static String voice = "strong";
    static String name;
    Dog(int age){
        System.out.println("Ему " + age + " лет");
    }
    static {
        name = "Ball";
    }
    static void print(){
        System.out.println(name);
        System.out.println(voice);
    }

}
class StreetDogs {
    static Dog simon;

}
package p173n15;

public class Main {
    public static void main(String[] args) {
        System.out.println("В методе main()");
        new Main();
        System.out.println("new Main() завершено");
        new Main(1);
        System.out.println("new Main(1) завершено");
    }
    Dog bulb;
    Dog ball;
    {
        bulb = new Dog(5);
        ball = new Dog(6);
        System.out.println("Я родился");
    }
    Main(){
        System.out.println("Dog()");
    }
    Main(int integer){
        System.out.println("нас " + integer);
    }
}
class Dog{
    Dog(int i){
        System.out.println("мне " + i + "лет");
    }
    void name(String name){
        System.out.println("меня зовут " + name);
    }
}

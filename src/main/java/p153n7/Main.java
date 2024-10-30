package p153n7;

public class Main {
    public static void main(String[] args) {
        Booblik dog = new Booblik();
        dog.bark();
        Booblik cat = new Booblik();
        cat.mew();
    }
}
class Booblik{
    void bark(){
        System.out.println("гав-гав-гав");
    }
    void mew(){
        System.out.println("мяу-мяу");
    }
}

package p155n8;

public class Main {
    public static void main(String[] args) {
        Dogs dog = new Dogs();
        dog.bark();
    }
}
class Dogs{
    void howl(){
        System.out.println("a-ooooow");
    }
    void bark(){
        howl();
        this.howl();
    }
}

package p212n3;

public class Main {
    Main(){
        System.out.println("Конструктор Main");
    }
}
class Drawing extends Main{
    Drawing(){
        System.out.println(10/0);
    }
}

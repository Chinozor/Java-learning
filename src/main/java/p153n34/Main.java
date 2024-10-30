package p153n34;

public class Main {
    public static void main(String[] args) {
        Dog booblik = new Dog();
        Dog muhktar = new Dog("лаять");
    }
}
class Dog{
    Dog() {
        System.out.println("Собака умеет говорить");
    }
    Dog(String s){
        System.out.println("Сoбака умеет " + s);
    }
}

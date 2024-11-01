package p177n17;

public class Main {
    public static void main(String[] args) {
        Dog[] name = new Dog[10];
        for (int i = 0; i < 10; i++) {
            name[i] = new Dog(Integer.toString(i));
        }
    }
}
class Dog{
    Dog(String string){
        System.out.println(string);
    }
}

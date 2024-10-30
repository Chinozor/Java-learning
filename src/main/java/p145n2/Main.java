package p145n2;

public class Main {
    public static void main(String[] args) {
        NameSound bob = new NameSound("krya");
        NameSound bob1 = new NameSound("kia");
        System.out.println(bob.name);
        System.out.println(bob.sound);
        System.out.println(bob1.name);
        System.out.println(bob1.sound);
    }
}
class NameSound{
    String name = "Bob";
    String sound;
    NameSound(String s){
        sound = s;
    }
}

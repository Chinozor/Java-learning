package p209n1;

public class Main {
    public static void main(String[] args) {
        System.out.println(Dogs.name);
        System.out.println(Dogs.voice);
        if (Dogs.name == null)
            new Cats();
        System.out.println(Dogs.name);
        System.out.println(Dogs.voice);
    }
}
class Dogs{
    static String name;
    static String voice;
    Dogs(){
        name = "Бобик";
        voice = "Гав-гав";
    }
}
class Cats{
    String name;
    String voice;
    Cats() {
        Dogs bubble = new Dogs();
    }
}
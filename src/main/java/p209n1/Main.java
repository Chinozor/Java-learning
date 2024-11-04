package p209n1;

public class Main {
    public static void main(String[] args) {
        System.out.println(Dogs.name);
        System.out.println(Dogs.voice);
        Cats lol = null;
        if (Dogs.name == null) {
            lol = new Cats();
        }
        System.out.println(Dogs.name);
        System.out.println(Dogs.voice);
        System.out.println(lol);
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
    int i;
    String color;
    Cats() {
        Dogs bubble = new Dogs();
    }
    public String toString(){
        return  "Количество кошек " + i;
    }
}
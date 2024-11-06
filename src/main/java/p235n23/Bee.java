package p235n23;

public class Bee extends Beetle{
    private static int x3 = printInit("Поле static Bee.x3 инициализировано");
    private int m = printInit("Поле Bee.k инициализировано");
    public Bee(){
        System.out.println("k = " + m);
        System.out.println("j = " + j);
    }
    public static void main(String[] args) {
        System.out.println("Конструктор Beetle");
        Bee b = new Bee();
        Bee c = new Bee();

    }
}

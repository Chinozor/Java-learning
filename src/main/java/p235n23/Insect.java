package p235n23;

public class Insect {
    private int i = 9;
    protected int j;
    Insect(){
        System.out.println("i = " + i + ", j = " + j);
        j = 39;
    }
    static int printInit(String s){
        System.out.println(s);
        return 46;
    }
    private static int x1 = printInit("Поле static Insect.x1 инициализировано");
}

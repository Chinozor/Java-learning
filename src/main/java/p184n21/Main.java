package p184n21;

public class Main {
    public static void main(String[] args) {
        for (Money m : Money.values())
            System.out.println(m + ", ordinal: " + m.ordinal());
    }
}
enum Money{
    DOLLARS, EURO, RUBLES, LIRA, POUND, FRANC
}

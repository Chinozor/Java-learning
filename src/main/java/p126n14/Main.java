package p126n14;

public class Main {
    public static void main(String[] args) {
        name("Yura", "Yura");

    }
    static void name(String s, String string ){
        boolean b = s == string;
        boolean b1 = s != string;
        boolean b2 = s.equals(string);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b);
    }
}

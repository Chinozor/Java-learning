package p278n15;

public class SmallestMain extends LittleMain {
    public static void a11(A a){
        a.a1();
        a.a2();
    }
    public static void b11(B b){
        b.b1();
        b.b2();
    }
    public static void c11(C c){
        c.c1();
        c.c2();
    }
    public static void d11(D d){
        d.d1();
    }
    public static void main(String[] args) {
        LittleMain littleMain = new LittleMain();
        a11(littleMain);
        b11(littleMain);
        c11(littleMain);
        d11(littleMain);
    }
}//Тоже вопросы к задаче. В ней требовалось просто поменять класс Main на абстрактный, буквально изменить одно слово. Просто зачем?

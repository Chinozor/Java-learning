package p276n12;

public class Adventure {
    public static void t(CanFight x){
        x.fight();
    }
    public static void u(CanFly x){
        x.fly();
    }
    public static void v(CanSwim x){
        x.swim();
    }
    public static void w(CanClimb x){
        x.climb();
    }

    public static void main(String[] args) {
        Hero h = new Hero();
        t(h);
        u(h);
        v(h);
        w(h);
    }
}
//А зачем это вообще делать, если можно написать: h.swim(), h.fight() и тд.
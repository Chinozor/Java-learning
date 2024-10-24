package p98n2;

public class P98n2 {
    public static void main(String[] args) {
        Tank su = new Tank();
        Tank is = new Tank();
        su.diametr = 152.0F;
        is.diametr = 122.0F;
        System.out.println("is diametr = " + is.diametr + " mm");
        System.out.println("su diametr = " + su.diametr + " mm");
        su = is;
        System.out.println("after changin ");
        System.out.println("is diametr = " + is.diametr + " mm");
        System.out.println("su diametr = " + su.diametr + " mm");
        is.diametr = 270.0F;
        System.out.println("after changin ");
        System.out.println("is diametr = " + is.diametr + " mm");
        System.out.println("su diametr = " + su.diametr + " mm");
    }
}
class Tank{
    float diametr;
}

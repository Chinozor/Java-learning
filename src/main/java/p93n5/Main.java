package p93n5;

public class Main {
    public static void main(String[] args) {
        DataOnly type = new DataOnly();
        type.b = false;
        type.d = 2.1;
        type.i = 3;
        type.show();

    }
}
class DataOnly{

    int i;
    double d;
    boolean b;

    public void show(){
        String gorchca = new String("Горчицы");
        String stoyat = new String("Стоят ");
        System.out.println(i + " банки " + gorchca);
        System.out.println(stoyat + d + " $?");
        System.out.println(b);

    }
}
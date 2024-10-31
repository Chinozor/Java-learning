package p161n10;

public class Main {
    public static void main(String[] args) {
        Tank t1 = new Tank(1);
        t1 = new Tank(2);
        System.gc();
    }
}
class Tank{ ;
    Integer counter = 1;
    Tank(int integer){
        System.out.println("Корабль");
        counter = integer;

    }
    @Override
    protected void finalize(){
        if (counter == 1){
            counter++;
        }
        System.out.println("Error" + counter);
    }
}

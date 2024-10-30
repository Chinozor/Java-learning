package p161n10;

public class Main {
    public static void main(String[] args) {
        Tank ship = new Tank();
        ship.tank(2);
        System.gc();
    }
}
class Tank{
    int i = 1;
    public void tank(Integer integer){
        if( integer != 1){
            i++;
        }
    }
    protected void finalize(){
        if (i == 1){
            System.out.println("Error");
        }
    }
}
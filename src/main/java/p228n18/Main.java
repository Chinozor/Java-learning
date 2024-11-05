package p228n18;

public class Main {
    static int i;
    final static int HEIGHT = 175;
    void height(int h){
        i = h;
        //HEIGHT = h;
    }

    public static void main(String[] args) {
        Main main =  new Main();
        main.height(180);
        System.out.println(i);
        System.out.println(HEIGHT);
    }
}

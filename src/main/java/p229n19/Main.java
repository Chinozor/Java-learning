package p229n19;

public class Main {
    final String i;
    Main(String m){
        i = m;
    }
    public static void main(String[] args) {
        Main main = new Main("13");
        System.out.println(main.i);
        Main main1 = new Main("14");
        System.out.println(main.i);
    }
}

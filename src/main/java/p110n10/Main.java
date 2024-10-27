package p110n10;

public class Main {
    public static void main(String[] args) {
        final int i = 0x55555555;
        final int t = -0x55555556;
        System.out.println(Integer.toBinaryString(i & t));
        System.out.println(Integer.toBinaryString(t | i));
        System.out.println(Integer.toBinaryString(t ^ i));
        System.out.println(Integer.toBinaryString(~i));

    }


}

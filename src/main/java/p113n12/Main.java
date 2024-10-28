package p113n12;

public class Main {
    public static void main(String[] args) {
        int i = 0xffffffff;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toBinaryString(i << 1));
        System.out.println(Integer.toBinaryString(i >>> 2));
        System.out.println(Integer.toBinaryString(i >>> 3));
        System.out.println(Integer.toBinaryString(i >>> 4));
        System.out.println(Integer.toBinaryString(i >>> 5));
        System.out.println(Integer.toBinaryString(i >>> 6));
        System.out.println(Integer.toBinaryString(i >>> 7));
        System.out.println(Integer.toBinaryString(i >>> 8));
        System.out.println(Integer.toBinaryString(i >>> 9));
    }
}

package p113n11;

public class Main {
    public static void main(String[] args) {
        int i = 0x55555555;
        System.out.println(i);
        System.out.println(Integer.toBinaryString(i));
        while (i != 1){
            int i1 = i >> 1;
            System.out.println(Integer.toBinaryString(i1));
            i = i1;
        }
    }
}

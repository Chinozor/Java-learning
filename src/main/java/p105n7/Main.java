package p105n7;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int a = 1 + (int) ( Math.random() * 2 );
        while (a >= 1 && a <= 2 ) {
            a = 1 + (int) (Math.random() * 2);
            System.out.println(a);
            if (a == 1)
                System.out.println("Heads");
            else
                System.out.println("Tails");
        }
    }
}

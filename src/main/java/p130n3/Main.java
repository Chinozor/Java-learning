package p130n3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int t = 1;
        int i = 1;
        while (t == 1){
            i++;
            Random random = new Random();
            int j = random.nextInt();
            int number = random.nextInt();
            System.out.println("Случай номер: " + i);
            System.out.println("Первое случайное число: = " + j);
            System.out.println("Второе случайное число: = " + number);
            if (j == number)
                System.out.println("Числа равны");
            else if (j > number)
                System.out.println("Первое число больше второго");
            else
                System.out.println("Второе число больше первого");
        }
    }
}

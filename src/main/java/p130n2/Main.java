package p130n2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        for (int i =1; i < 26; i++){
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

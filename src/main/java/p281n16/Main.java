package p281n16;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static String Main(int i) {
        char[] chars = new char[i];
        Random random = new Random();
        for (int j = 0; j < chars.length; j++) {
           chars[j] =(char) random.nextInt(65534);
        }
        return Arrays.toString(chars);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(Main(10));
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
        scanner.close();
    }
}
//ну мне не нравится как это выглядит, мб есть какие-то предложения

package SlotMachine;

import java.util.Scanner;

public class User {
    static String[] userName;
    static String[] password;
    static Scanner scanner = new Scanner(System.in);
    static void userRegistration(){
        System.out.print("Придумайте ваш username: ");
        userName[0] = scanner.nextLine();
        System.out.print("Придумайте пароль: ");
        password[0] = scanner.nextLine();
        System.out.println("Поздравляем, вы успешно зарегистрировались: Ваш username: " + userName[0] + ". Ваш пароль: " + password[0]);
    }
    static void userAutorisation(){
        System.out.println("Введите ваш username: ");

        System.out.println("Введите ваш пароль: ");

    }
}

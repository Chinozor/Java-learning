package SlotMachine;
import java.util.*;

public class Money {
    public static int bet;
    public static int bank;
    Scanner scanner = new Scanner(System.in);
    void accountReplenishment(){
        System.out.print("Введите ваш банк: ");
        bank = scanner.nextInt();
        System.out.println("Поздравляем! Ваш баланс равен " + bank + " у.е.");
    }
    void newBet(){
        System.out.print("Сколько вы хотите поставить? ");
        bet = scanner.nextInt();
        System.out.println("Ваша ставка принята");
        bank = bank - bet;
    }
    void getPrize(){
        if (SlotMachine.counter == 1)
            bank = bank - bet;
        else {
            bank = bank + bet * SlotMachine.counter * SlotMachine.slot[0];
        }
    }
}

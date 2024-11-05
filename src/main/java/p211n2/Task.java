package p211n2;

public class Task extends Detergent{
    public void scrub(){
        System.out.println("scrub() + 1");
    }
    public  void sterilize(){
        System.out.println("lol");
    }

    public static void main(String[] args) {
        Task n = new Task();
        n.dilute();
        n.apply();
        n.scrub();
        n.foam();
        n.sterilize();
        System.out.println(n);
        System.out.println("Проверяем базовый класс");
        Cleanser.main(args);
    }
}

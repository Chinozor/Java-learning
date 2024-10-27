package p104n5;

public class Main {
    public static void main(String[] args) {
        Dog booblik = new Dog();
        Dog bee = new Dog();
        bee.name = "Пчелка";
        booblik.name = "Бублик";
        bee.says = "Я девочка";
        booblik.says = "Я кобель";
        System.out.println("Имя девочки " + bee.name + ". Она говорит - " + bee.says);
        System.out.println("Имя мальчика " + booblik.name + ". Он говорит - " + booblik.says);
        System.out.println("Вывод: Бублик лучше разбирается в названиях полов собак");
    }


}
class Dog {
    String name;
    String says;
}

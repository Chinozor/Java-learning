package p153n5;

public class Main {
    public static void main(String[] args) {
        Dog booblik = new Dog();
        booblik.bark(2.4f);
        booblik.bark("l");
        booblik.bark(1);
        booblik.nameAge(12, "Бублик");
        booblik.nameAge("Бублик", 12);
    }
}
class Dog{
    void bark(Integer integer){
        System.out.println("bark");
    }
    void bark(String string){
        System.out.println("howl");
    }
    void bark(float m){
        System.out.println("whine");
    }
    void nameAge(String name, Integer age){
        System.out.println("Эту собаку зовут " + name + ". Eе возраст: " + age + " лет");
    }
    void nameAge(Integer age, String name){
        System.out.println("Возраст этой собаки " + age + " лет. Ее зовут " + name);
    }
}

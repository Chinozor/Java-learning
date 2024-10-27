package p104n6;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Dog booblik = new Dog();
        Dog bee = new Dog();
        Dog newBooblik = new Dog();
        newBooblik.name = new String("Бублик");
        newBooblik.says = "Я кобель";
        bee.name = "Пчелка";
        booblik.name = "Бублик";
        bee.says = "Я девочка";
        booblik.says = "Я кобель";
        System.out.println("Имя девочки " + bee.name + ". Она говорит - " + bee.says);
        System.out.println("Имя мальчика " + booblik.name + ". Он говорит - " + booblik.says);
        System.out.println("Вывод: Бублик лучше разбирается в названиях полов собак");
        System.out.println(newBooblik == booblik);
        System.out.println(newBooblik.equals(booblik));
    }
}
class Dog {
    @Override
    public int hashCode() {
        return Objects.hash(name, says);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name) && Objects.equals(says, dog.says);
    }

    String name;
    String says;
}
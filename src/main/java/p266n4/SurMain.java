package p266n4;

public class SurMain extends Main {
    void name(){
        System.out.println("Name");
    }
    static void voice(Main main){
        ((SurMain)main).name();
    }
    public static void main(String[] args) {
        SurMain main = new SurMain();
        voice(main);
        main.name();
    }
}
/*
abstract class Dad {
}

class Son extends Dad {
    protected void print() { println("Son"); }
}

abstract class SecondDad {
    abstract protected void print();
}

class SecondSon extends SecondDad {
    protected void print() { println("SecondSon"); }
}

public class Ex4 {
    public static void testPrint(Dad d) {
        ((Son)d).print();
    }
    public static void secondTestPrint(SecondDad sd) {
        sd.print();
    }
    public static void main(String[] args) {
        Son s = new Son();
        Ex4.testPrint(s);
        SecondSon ss = new SecondSon();
        Ex4.secondTestPrint(ss);
    }
}*/
//Сравнить с примером, не сильно понял что происходит.
/*
Создайте абстрактный (abstract) класс без методов. Произведите от него класс
и добавьте метод. Создайте статический (static) метод, получающий ссылку на
        базовый класс, проведите нисходящее преобразование к производному типу и вы
зовите его метод. Продемонстрируйте, что такой способ работает, в методе main().
Теперь поместите в определение метода из базового класса ключевое слово abstract,
и необходимость в нисходящем преобразовании исчезнет.*/

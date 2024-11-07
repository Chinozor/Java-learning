package p247n10;

public class Rodent {
    void voice(){
        System.out.println("Я не говорю, я грызун");
        eat();
    }
    void eat(){
        System.out.println("Я могу есть");
    }

    public static void main(String[] args) {
        Rodent jack =  new Squirrel();
        jack.voice();
    }
}


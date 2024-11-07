package p254n12;

public class Rodent {
    Rodent() {
        System.out.println("Я грызун");
    }
    void voice(){
        System.out.println("Я не говорю, я грызун");
    }
    public String toString(){
        return "Грызун";
    }
    void eat(){
        System.out.println("Я могу есть");
    }
}


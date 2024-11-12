package p266n4;

public class SurMain extends Main {
    void name(){
        System.out.println("Name");
    }
    static void voice(Main main){
        ((SurMain)main).name();
    }
    protected void name1(Main n) {
        System.out.println("Name1");
    }
}


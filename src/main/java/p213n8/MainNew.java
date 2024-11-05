package p213n8;

public class MainNew extends Main {
    MainNew(){
        super(11);
        System.out.println("11");
    }
    MainNew(int i){
        super(i);
        System.out.println(i);
    }

    public static void main(String[] args) {
        MainNew c = new MainNew();
        MainNew b = new MainNew(167);
    }
}

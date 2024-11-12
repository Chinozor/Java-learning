package p266n3;

public class SurMain extends Main {
    Integer i = 14;
    @Override
    void print() {
        this.i = i;
        System.out.println(i);
    }

    public static void main(String[] args) {
        SurMain surMain =  new SurMain();
        surMain.print();
    }
}

package p156n9;

public class Main {
    public static void main(String[] args) {
        Dogs bulb = new Dogs(1);

    }
}
class Dogs{
    Dogs(String string){
        System.out.println(string);
    }
    Dogs(Integer integer){
        this("bark");
    }
}

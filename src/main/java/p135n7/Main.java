package p135n7;

public class Main {
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++) {
            System.out.println(i + 1);
            if(i == 99)
                return;
        }
    }
}
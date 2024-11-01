package counter.counter;

public class Main {
    public static void main(String[] args) {
        int number = 3;
        int counter = 0;
        int mainCounter = 0;
        for (int j = 1; j <= number ; j++) {
            for (int i = 1; i <= j; i++) {
                if (j % i == 0) {
                counter++;
            }
            if (counter > mainCounter){
                mainCounter = counter;
            }
        }
            counter = 0;
        }
        System.out.println(mainCounter);
    }
}

package p131n4;

public class Main {
    public static void main(String[] args) {
        int number = 29;
        int i2 = 0;
        for (int i = 2; i < number; i++) {
            for (int j = 2; number %  i == 0; j++){
                 i2 = i;
                 if (i2 != 0)
                     break;
            }
        }
        if (i2 == 0)
            System.out.println("Простое");
        else
            System.out.println("Составное");
    }

}

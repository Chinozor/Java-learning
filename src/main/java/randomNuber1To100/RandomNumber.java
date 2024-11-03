package randomNuber1To100;


public class RandomNumber {
    static int random;
    static int sleep;
    static int random1;
    static int random2;
    static int randomNumber;

    public static void main(String[] args) {
            for (int i = 0; i < (System.currentTimeMillis() % 10) + 1; i++) {
                random = (int) (System.currentTimeMillis() % 100);
                sleep = (int) (((System.currentTimeMillis() % 10)) * ((System.currentTimeMillis() % 10)) / ((System.currentTimeMillis() % 10) + 1));
                try {
                    Thread.sleep(sleep + 1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            for (int i = 0; i < (System.currentTimeMillis() % 10) + 1; i++) {
                random1 = (int) (System.currentTimeMillis() % 100 + 1);
                sleep = (int) (((System.currentTimeMillis() % 10)) * ((System.currentTimeMillis() % 10)) / ((System.currentTimeMillis() % 10) + 1));
                try {
                    Thread.sleep(sleep + 1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (random1 < 10)
                    random1 = (int) (System.currentTimeMillis() % 1000);
            }
            for (int i = 0; i < (System.currentTimeMillis() % 10) + 1; i++) {
                random2 = (int) (System.currentTimeMillis() % 100 + 1);
                sleep = (int) (((System.currentTimeMillis() % 10)) * ((System.currentTimeMillis() % 10)) / ((System.currentTimeMillis() % 10) + 1));
                try {
                    Thread.sleep(sleep + 1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (random2 < 10)
                    random2 = (int) (System.currentTimeMillis() % 1000);
            }
            randomNumber = (random1 * random + random2) % 100;
            System.out.println(randomNumber);
    }
}

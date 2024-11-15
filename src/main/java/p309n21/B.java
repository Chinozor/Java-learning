package p309n21;

public class B {
    U[] us = new U[10];
    private static int i = 0;

    void save(U u) {
        us[i] = u;
        i++;
    }

    void makeNull(int per) {
        us[per] = null;
    }

    void doThis() {
        for (int j = 0; j < i; j++) {
            if (us[j] != null) {
                us[j].a();
                us[j].b();
                us[j].c();
            }
            else
                System.out.println("null");
        }
    }
}

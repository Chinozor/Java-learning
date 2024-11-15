package p309n21;

public class A {
    public U u(){
        return new U() {
            @Override
            public void a() {
                System.out.println("A");
            }

            @Override
            public void b() {
                System.out.println("B");
            }

            @Override
            public void c() {
                System.out.println("C");
            }
        };
    }
}

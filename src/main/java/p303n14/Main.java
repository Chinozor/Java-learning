package p303n14;

public class Main {
    Inter inter(){
        return new Inter() {
            @Override
            public String process(String s) {
                char[] c = s.toCharArray();
                char[] c1 = new char[c.length];
                for (int i = 0; i < c.length; i ++){
                    if (i % 2 == 0 && i != (c.length - 1))
                        c1[i] = c[i + 1];
                    else if (i % 2 == 1 && i != (c.length - 1)) {
                        c1[i] = c[i - 1];
                    }
                    else if (i % 2 == 0)
                        c1[i] = c[i];
                    else{
                        c1[i] = c[i - 1];
                    }
                }
                return new String(c1);
            }
        };
    }

    public static void main(String[] args) {
        Main main = new Main();
        Inter inter = main.inter();
        System.out.println(inter.process("Егор"));
    }
}

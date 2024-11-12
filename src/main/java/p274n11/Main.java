package p274n11;

public class Main {
    public void stringArray(String s){
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
        System.out.println(c1);
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.stringArray("Егор");
    }
}
//что значит адаптировать его? Сделать попозже чут чут
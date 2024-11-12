package p274n11;

public class Main {
    public static String process(String s){
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
        return new String(c1); //была ошибка, попытался внутри () преобразовать в String, но String сам преобразует все
    }
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(process("Егор"));
    }
}
//ну вроде адаптировал)
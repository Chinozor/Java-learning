package p318n24;

public class Outer {
    public class Inner{
        Inner(int i){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        Main.Inner2 inner2 = main.new Inner2(new Outer(),10 );
    }
}

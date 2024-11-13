package p290n1;

public class Outer {
    private static String string;

    static class Inner{
        public Outer outer(){
            return new Outer();
        }
        Inner(String s){
            string = s;
        }
        @Override
        public String toString() {
            return string;
        }
    }
    public static void main(String[] args) {
        Inner inner = new Inner("MyName");
        System.out.println(inner);
    }
}

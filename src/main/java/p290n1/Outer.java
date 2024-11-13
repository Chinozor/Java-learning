package p290n1;

public class Outer {
    @Override
    public String toString() {
        return "Внешний класс";
    }
    static class Inner{
        public Outer outer(){
            return new Outer();
        }
    }
    public static void main(String[] args) {
        Inner inner = new Inner();
        System.out.println(inner.outer());
    }
}

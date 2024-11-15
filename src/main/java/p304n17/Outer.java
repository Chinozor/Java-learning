package p304n17;

public class Outer {
    String string;
    Outer(String s){
        string = s;
    }
    @Override
    public String toString() {
        return string;
    }
    static class Inner{
        String strin;
        Inner(String sg){
            strin = sg;
        }
        @Override
        public String toString() {
            return strin;
        }
        static class InnerInInner{
            String stri;
            InnerInInner(String sng){
                stri = sng;
            }
            @Override
            public String toString() {
                return stri;
            }
        }
    }

    public static void main(String[] args) {
       /* Outer outer = new Outer("Я");
        Outer.Inner inner = outer.new Inner("не хочу");
        Outer.Inner.InnerInInner innerInInner = inner.new InnerInInner("работать на АЭС");
        System.out.println(outer + " " + inner + " " + innerInInner);*///Как писалось бы просто со внутренними классами.
        Outer outer = new Outer("Я");
        Inner inner = new Inner("не хочу ");
        Inner.InnerInInner innerInInner = new Inner.InnerInInner("работать на АЭС");
        System.out.println(outer + " " + inner + innerInInner);
    }
}

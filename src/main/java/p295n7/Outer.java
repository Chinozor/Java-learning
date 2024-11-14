package p295n7;

public class Outer {
    private int i = 10;
    private void priv(){
        System.out.println("Outer i =" + i);
    }
    public class Inner{
        private int n = 0;
        void replace(){
            i ++;
            priv();
        }
    }
    public void next(){
        Inner inner = new Inner();
        inner.replace();
    }
}

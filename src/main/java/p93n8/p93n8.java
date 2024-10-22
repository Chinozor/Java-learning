package p93n8;

public class p93n8 {
    public static void main(String[] args) {
        Iq random = new Iq();
        Iq notRandom = new Iq();
        System.out.println(random.medianIq);
        System.out.println(notRandom.medianIq);
        inrementable.increment();
        System.out.println(random.medianIq);
        System.out.println(notRandom.medianIq);
        inrementable.increment();
        System.out.println(random.medianIq);
        System.out.println(notRandom.medianIq);
        Iq.medianIq = 99;
        System.out.println(random.medianIq);
        System.out.println(notRandom.medianIq);
    }
}
class Iq{
    static int medianIq = 100;
}
class inrementable{
    static void increment(){
        Iq.medianIq++;
    }
}
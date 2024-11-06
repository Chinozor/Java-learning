package p231n20;

public class Puppy extends Dog{
    @Override
    public void name(String name){
        System.out.println("My name is " + name);
    }
    @Override
    public void sound(){
        System.out.println("гав-гав");
    }
    public static void main(String[] args) {
        Puppy bulb =  new Puppy();
        bulb.name("Bulb");
        bulb.sound();
    }

}

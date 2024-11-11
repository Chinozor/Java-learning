package p260n17;

public class Starship {
    void cat(){}
}
class A extends Starship{
    void cat(){
        System.out.println("AAAAA");
    }
}
class B extends Starship{
    @Override
    void cat() {
        System.out.println("BBBBB");
    }
}
class C extends Starship{
    @Override
    void cat() {
        System.out.println("CCCCC");
    }
}
class  Stage{
    private Starship starship = new A();
    public void change(){
        starship =  new B();
    }
    public void perfomCat(){
        starship.cat();
    }
}
class Main{
    public static void main(String[] args) {
        Stage stage = new Stage();
        stage.perfomCat();
        stage.change();
        stage.perfomCat();
    }
}
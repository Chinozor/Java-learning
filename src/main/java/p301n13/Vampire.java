package p301n13;

public class Vampire {
    public Monster species() {
        return new Monster(10) {
        };
    }


    public static void main(String[] args) {
        Vampire vlad = new Vampire();
        System.out.println(vlad.species());
    }
}

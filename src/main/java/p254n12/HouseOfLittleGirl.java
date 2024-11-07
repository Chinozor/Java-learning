package p254n12;

import java.util.Random;

public class HouseOfLittleGirl {
    static Random random = new Random();
    public static Rodent randomRodent(){
        switch (random.nextInt(3)) {
            default:
            case 0: return new Mouse();
            case 1: return new Hamster();
            case 2: return new Squirrel();
        }
    }
    public static void zooInHome(Rodent rodent){
        rodent.eat();
        rodent.voice();
    }
    public static void allTogether(Rodent[] r){
        for(Rodent m: r)
            zooInHome(m);
    }
    public static void main(String[] args) {
        Rodent[] zoo = new Rodent[1];
        for (int i = 0; i < zoo.length; i++) {
            zoo[i] = randomRodent();
        }
        allTogether(zoo);
    }
}

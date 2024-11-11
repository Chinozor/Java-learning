package p255n15;

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

    public static void main(String[] args) {
        Rodent[] zoo = new Rodent[10];
        for (int i = 0; i < zoo.length; i++) {
            zoo[i] = randomRodent();
        }
    }
}
//Сравнить с примером в книжке, в чем мое неправильно, или мб правильно?

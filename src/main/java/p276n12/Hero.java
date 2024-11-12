package p276n12;

public class Hero extends ActionCharacter implements CanSwim, CanFight, CanFly, CanClimb {

    @Override
    public void climb() {
        System.out.println("I can climb");
    }

    @Override
    public void fly() {
        System.out.println("I can fly");
    }

    @Override
    public void swim() {
        System.out.println("I can swim");
    }
}

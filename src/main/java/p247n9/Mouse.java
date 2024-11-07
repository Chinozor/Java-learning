package p247n9;

class Mouse extends Rodent{
    @Override
    void eat() {
        System.out.println("Я ем сыр");
    }

    @Override
    public String toString() {
        return "Mouse";
    }

    @Override
    void voice() {
        System.out.println("Я могу пищать");
    }
}

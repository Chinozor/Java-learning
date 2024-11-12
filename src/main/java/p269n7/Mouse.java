package p269n7;

class Mouse implements Rodent {
    @Override
    public void eat() {
        System.out.println("Я ем сыр");
    }

    @Override
    public String toString() {
        return "Mouse";
    }

    @Override
    public void voice() {
        System.out.println("Я могу пищать");
    }
}

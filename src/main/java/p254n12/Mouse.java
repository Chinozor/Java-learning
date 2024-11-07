package p254n12;

class Mouse extends Rodent {
    Mouse(){
        System.out.println("Я танк, что я здесь забыл?");
    }
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

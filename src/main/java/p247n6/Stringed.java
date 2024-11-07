package p247n6;

class Stringed extends Instrument{
    @Override
    void play(Note note) {
        System.out.println("Stringed.play() " + note);
    }


    public String toString() {
        return "Stringed";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Stringed");
    }
}

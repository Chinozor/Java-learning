package p247n7;

class Percussion extends Instrument {
    @Override
    void play(Note note) {
        System.out.println("Percussion,play() " + note);
    }

    public String toString() {
        return "Percussion";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Percussion");
    }
}

package p247n7;

class Wind extends Instrument {
    @Override
    void play(Note note) {
        System.out.println("play.Wind() " + note);
    }

    public String toString() {
        return "Wind";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Wind");
    }
}

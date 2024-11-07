package p247n7;

class Piano extends Instrument{
    @Override
    void play(Note note) {
        System.out.println("Piano.play " + note);
    }
    public String toString(){
        return "Piano";
    }

    @Override
    void adjust() {
        System.out.println("Adjusted Piano");
    }
}

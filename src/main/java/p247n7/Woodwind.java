package p247n7;

class Woodwind extends Wind {
    @Override
    void play(Note note) {
        System.out.println("Woodwind.play() " + note);
    }


    public String toString() {
        return "Woodwind";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Woodwind");
    }
}

package p247n6;

class Brass extends Wind {
    @Override
    void play(Note note) {
        System.out.println("Brass.play() " + note);
    }


    public String toString() {
        return "Brass";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Brass");
    }
}

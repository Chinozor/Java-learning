package p270n9;

class Wind extends Instrument{

    @Override
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    @Override
    public void adjust() {
        System.out.println(this + " adjust");
    }

    @Override
    public String toString() {
        return "Wind";
    }
}
class Percussion extends Instrument{

    @Override
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    @Override
    public void adjust() {
        System.out.println(this + " adjust");
    }

    @Override
    public String toString() {
        return "Percussion";
    }
}
class Stringed extends Instrument{

    @Override
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    @Override
    public void adjust() {
        System.out.println(this + " adjust");
    }

    @Override
    public String toString() {
        return "Stringed";
    }
}
class Brass extends Wind {

    @Override
    public String toString() {
        return "Brass";
    }
}
class Woodwind extends Wind {

    @Override
    public String toString() {
        return "Brass";
    }
}
public class Music5 {
    static void tune(Instrument instrument){
        instrument.play(Note.B_FLAT);
    }
    static void tuneAll(Instrument[] e){
        for(Instrument i: e)
            tune(i);
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(),
                new Brass(),
                new Percussion(),
                new Woodwind(),
                new Stringed()
        };
        tuneAll(orchestra);
    }
}
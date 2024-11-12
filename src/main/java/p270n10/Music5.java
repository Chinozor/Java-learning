package p270n10;

class Wind extends Instrument implements Playable {

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
class Percussion extends Instrument implements Playable{

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
class Stringed extends Instrument implements Playable{

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
class Brass extends Wind implements Playable{

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
    static void tune(Playable pl){
        pl.play(Note.B_FLAT);
}
    static void tuneAll(Instrument[] e){
        for(Instrument i: e)
            tune((Playable) i);
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
//Как работает передача интерфейса в аргумент? Как работает в данной программе?
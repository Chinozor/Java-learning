package p247n7;

public class Music3 {
    public static void tune(Instrument instrument){
        instrument.play(Note.B_FLAT);
    }
    public static void tuneALL(Instrument[] instruments){
        for(Instrument instrument : instruments)
            tune(instrument);
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind(),
                new Piano()
        };
        tuneALL(orchestra);
        for(Instrument i: orchestra)
            System.out.println(i);
    }
}

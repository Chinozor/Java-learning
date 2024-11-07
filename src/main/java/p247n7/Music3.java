package p247n7;

import java.util.Random;

public class Music3 {
    static Random random =  new Random();
    static Instrument randomInstrument(){
        switch (random.nextInt(6)){
            default:
            case 0: return new Brass();
            case 1: return  new Percussion();
            case 2: return new Piano();
            case 3: return new Stringed();
            case 4: return new Wind();
            case 5: return new Woodwind();
        }

    }
    public static void tune(Instrument instrument){
        instrument.play(Note.B_FLAT);
    }
    public static void tuneALL(Instrument[] instruments){
        for(Instrument instrument : instruments)
            tune(instrument);
    }

    public static void main(String[] args) {
        Instrument[] orchestra = new Instrument[7];
        for (int i = 0; i < orchestra.length; i++) {
            orchestra[i] = randomInstrument();

        }
        tuneALL(orchestra);
        for(Instrument i: orchestra)
            System.out.println(i);
    }
}

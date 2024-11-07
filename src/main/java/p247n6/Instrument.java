package p247n6;

public class Instrument {
    void play(Note note){
        System.out.println("Instrument.play() " + note);
    }
    public String toString(){
        return "Instrument";
    }
    void adjust(){
        System.out.println("Adjusting Instrument");
    }
}

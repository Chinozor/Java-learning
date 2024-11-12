package p270n9;

abstract class Instrument {
    int VALUE = 5;
    public abstract void play(Note n);
    public abstract void adjust();
    @Override
    public String toString() {return "Instument";}
}
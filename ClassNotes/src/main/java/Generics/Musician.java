package Generics;

public class Musician {

    String name;
    String instrument;

    public Musician (String name, String instrument) {
        this.name = name;
        this.instrument = instrument;
    }

    //region getters
    public String getName() {
        return name;
    }

    public String getInstrument() {
        return instrument;
    }
    //endregion

    public void perform() {
        System.out.println(this.name + " is playing the " + this.instrument);
    }

    public void swapInstruments(Musician o) {
        String temp = this.instrument;
        this.instrument = o.instrument;
        o.instrument = temp;
        System.out.println("OMG! They swapped instruments!\n");
    }
}

package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.
        CD   cd = new CD("Lust for Life", 716800, "Lana Del Rey");
        DVD dvd = new DVD("Barbie", 9856615, "adventure/comedy/fantasy");

        cd.spinDisc();
        cd.playMusic();
        dvd.spinDisc();
        dvd.playMovie();
    }
}
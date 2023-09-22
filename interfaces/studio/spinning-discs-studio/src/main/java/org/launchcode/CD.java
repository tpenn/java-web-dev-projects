package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc {
    private String artist;

    public CD(String name, long storageCapacity, String artist) {
        super(name, storageCapacity);
        this.artist = artist;
    }

    // TODO: Implement your custom interface.
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 500 RPM.");
    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    public void playMusic() {
        System.out.println("Playing music by " + artist + ".");
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}

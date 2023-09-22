package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc {
    private String genre;

    public DVD(String name, long storageCapacity, String genre) {
        super(name, storageCapacity);
        this.genre = genre;
    }

    // TODO: Implement your custom interface.
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570 - 1600 RPM.");
    }
    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    public void playMovie() {
        System.out.println("Playing " + genre + " movie.");
    }
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}

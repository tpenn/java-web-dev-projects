package technology;

public class Laptop extends Computer {
    private double screenSize;

    public Laptop(String manufacturer, String model, String processor, double screenSize) {
        super(manufacturer, model, processor);
        this.screenSize = screenSize;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
}

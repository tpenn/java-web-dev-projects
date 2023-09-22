package technology;

public class Computer extends AbstractEntity {
    private String manufacturer;
    private String model;
    private String processor;
    private String processorArch;
    private int memory;

    public Computer(String manufacturer, String model, String processor) {
        super();

        this.manufacturer = manufacturer;
        this.model = model;
        this.processor = processor;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getProcessorArch() {
        return processorArch;
    }

    public void setProcessorArch(String processorArch) {
        this.processorArch = processorArch;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
}

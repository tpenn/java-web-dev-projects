package org.launchcode;

public abstract class BaseDisc {
    private String name;
    private long storageCapacity;

    public BaseDisc(String name, long storageCapacity) {
        this.name = name;
        this.storageCapacity = storageCapacity;
    }

    public void printInfo() {
        System.out.println("Disc Name: " + name + "\nCapacity (KB): " + storageCapacity);
    }

    public long getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(long storageCapacity) {
        this.storageCapacity = storageCapacity;
    }
}

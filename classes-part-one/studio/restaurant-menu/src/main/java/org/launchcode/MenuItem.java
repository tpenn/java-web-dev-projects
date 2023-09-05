package org.launchcode;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private boolean isNew;
    private boolean isVegan;
    private boolean isGF;


    public MenuItem(String name, double price, String desc, String cat, boolean iN, boolean iV, boolean iG) {
        this.name = name;
        this.price = price;
        this.description = desc;
        this.category = cat;
        this.isNew = iN;
        this.isVegan = iV;
        this.isGF = iG;
    }

    public void setName(String name) { this.name = name; }
    public void setVegan(boolean isVegan) { this.isVegan = isVegan; }
    public void setGF(boolean isGF) { this.isGF = isGF; }
    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public String getName() { return name; }
    public String getDescription() { return description; }
    public String getCategory() { return category; }
    public boolean isNew() { return isNew; }
    public boolean isVegan() { return isVegan; }
    public boolean isGF() { return isGF; }
}

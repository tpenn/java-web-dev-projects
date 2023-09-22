package technology;

public class AbstractEntity {
    private final int ID;
    private static int nextID = 1;

    public AbstractEntity() {
        ID = nextID++;
    }

    public int getID() {
        return ID;
    }
}

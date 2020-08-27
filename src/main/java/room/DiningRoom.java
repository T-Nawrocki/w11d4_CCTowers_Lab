package room;

public class DiningRoom extends Room{

    private String name;

    public DiningRoom(String name, int capacity) {
        super();
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }
}

package room;

public class ConferenceRoom extends Room {

    private String name;

    public ConferenceRoom(String name, int capacity) {
        super();
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

}

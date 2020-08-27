package room;

import guest.Guest;
import java.util.ArrayList;

public abstract class Room {

    protected int capacity;
    private ArrayList<Guest> guests;

    public Room() {
        guests = new ArrayList<Guest>();
    }

    public int getCapacity() {
        return capacity;
    }

    public int getNumberOfGuests() {
        return guests.size();
    }
}

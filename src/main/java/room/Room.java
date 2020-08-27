package room;

import guest.Guest;
import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guests;

    public Room() {
        guests = new ArrayList<Guest>();
    }

}

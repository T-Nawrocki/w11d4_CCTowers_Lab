package hotel;

import guest.Guest;
import room.Bedroom;
import room.ConferenceRoom;
import room.DiningRoom;
import room.Room;

import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferencerooms;
    private HashMap<String, DiningRoom> diningrooms;

    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferencerooms, HashMap<String, DiningRoom> diningrooms) {
        this.bedrooms = bedrooms;
        this.conferencerooms = conferencerooms;
        this.diningrooms = diningrooms;
    }

    public int getBedrooms() {
        return this.bedrooms.size();
    }

    public int getConferencerooms() {
        return this.conferencerooms.size();
    }

    public void checkIn(Guest guest, Room room) {
        if (getVacantBedrooms().contains(room)) room.addGuest(guest);
    }

    public void checkOut(Guest guest, Room room) {
        room.removeGuest(guest);
    }

    public Booking bookRoom(Bedroom bedroom, int nights) {
        return new Booking(bedroom, nights);
    }

    public HashMap<String, DiningRoom> getDiningrooms() {
        return diningrooms;
    }

    public ArrayList<Bedroom> getVacantBedrooms() {
        ArrayList<Bedroom> result = new ArrayList<Bedroom>();
        for (Bedroom bedroom: bedrooms) {
            if (bedroom.getNumberOfGuests() == 0) result.add(bedroom);
        }
        return result;
    }
}

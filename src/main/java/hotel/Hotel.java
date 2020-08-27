package hotel;

import guest.Guest;
import room.Bedroom;
import room.ConferenceRoom;
import room.Room;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferencerooms;

    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferencerooms) {
        this.bedrooms = bedrooms;
        this.conferencerooms = conferencerooms;
    }

    public int getBedrooms() {
        return this.bedrooms.size();
    }

    public int getConferencerooms() {
        return this.conferencerooms.size();
    }

    public void checkIn(Guest guest, Room room) {
        room.addGuest(guest);
    }

    public void checkOut(Guest guest, Room room) {
        room.removeGuest(guest);
    }

    public Booking bookRoom(Bedroom bedroom, int nights) {
        return new Booking(bedroom, nights);
    }

}

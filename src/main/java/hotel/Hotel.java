package hotel;

import room.Bedroom;
import room.ConferenceRoom;

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
}

import hotel.Hotel;
import org.junit.Before;
import org.junit.Test;
import room.Bedroom;
import room.ConferenceRoom;
import room.RoomType;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;
    Bedroom bedroom;
    ConferenceRoom conferenceroom;

    @Before
    public void before() {
        bedroom = new Bedroom(34, RoomType.SINGLE);
        conferenceroom = new ConferenceRoom("The Blue Room", 80);
        ArrayList<Bedroom> bedroomList = new ArrayList<Bedroom>();
        bedroomList.add(bedroom);
        ArrayList<ConferenceRoom> conferenceroomList = new ArrayList<ConferenceRoom>();
        conferenceroomList.add(conferenceroom);
        hotel = new Hotel(bedroomList, conferenceroomList);
    }

    @Test
    public void hasBedrooms() {
        assertEquals(1, hotel.getBedrooms());
    }

    @Test
    public void hasConferencerooms() {
        assertEquals(1, hotel.getConferencerooms());
    }




}

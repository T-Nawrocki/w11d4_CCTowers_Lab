import guest.Guest;
import hotel.Booking;
import hotel.Hotel;
import org.junit.Before;
import org.junit.Test;
import room.Bedroom;
import room.ConferenceRoom;
import room.DiningRoom;
import room.RoomType;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HotelTest {
    Hotel hotel;
    Bedroom bedroom;
    ConferenceRoom conferenceroom;
    Guest guest;
    DiningRoom diningroom;

    @Before
    public void before() {
        bedroom = new Bedroom(34, RoomType.SINGLE, 200);
        conferenceroom = new ConferenceRoom("The Blue Room", 80);
        ArrayList<Bedroom> bedroomList = new ArrayList<Bedroom>();
        bedroomList.add(bedroom);
        ArrayList<ConferenceRoom> conferenceroomList = new ArrayList<ConferenceRoom>();
        conferenceroomList.add(conferenceroom);
        guest = new Guest("Rebeka");
        diningroom = new DiningRoom("Rustic", 15);
        HashMap<String, DiningRoom> diningRoomList = new HashMap<String, DiningRoom>();
        diningRoomList.put(diningroom.getName(), diningroom);
        hotel = new Hotel(bedroomList, conferenceroomList, diningRoomList);
    }

    @Test
    public void hasBedrooms() {
        assertEquals(1, hotel.getBedrooms());
    }

    @Test
    public void hasConferencerooms() {
        assertEquals(1, hotel.getConferencerooms());
    }

    @Test
    public void canCheckInGuest() {
        hotel.checkIn(guest, bedroom);
        assertEquals(1, bedroom.getNumberOfGuests());
    }

    @Test
    public void canCheckOutGuest() {
        hotel.checkIn(guest, bedroom);
        hotel.checkOut(guest, bedroom);
        assertEquals(0, bedroom.getNumberOfGuests());
    }

    @Test
    public void canBookRoom() {
        Booking expected = new Booking(bedroom, 3);
        Booking hotelBooking = hotel.bookRoom(bedroom, 3);
        assertEquals(expected.getBedroom(), hotelBooking.getBedroom());
        assertEquals(expected.getNights(), hotelBooking.getNights());
    }

    @Test
    public void hasDiningrooms() {
        HashMap<String, DiningRoom> expected = new HashMap<String, DiningRoom>();
        expected.put(diningroom.getName(), diningroom);
        HashMap<String, DiningRoom> actual = hotel.getDiningrooms();
        assertTrue(actual.equals(expected));
    }


}

import guest.Guest;
import org.junit.Before;
import org.junit.Test;
import room.ConferenceRoom;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom("The Green Room", 24);
        guest = new Guest("Tomek");
    }

    @Test
    public void hasRoomName() {
        assertEquals("The Green Room", conferenceRoom.getName());
    }

    @Test
    public void hasCapacity() {
        assertEquals(24, conferenceRoom.getCapacity());
    }

    @Test
    public void guestListStartsEmpty() {
        assertEquals(0, conferenceRoom.getNumberOfGuests());
    }

    @Test
    public void canAddGuest() {
        conferenceRoom.addGuest(guest);
        assertEquals(1, conferenceRoom.getNumberOfGuests());
    }

    @Test
    public void canRemoveGuest() {
        conferenceRoom.addGuest(guest);
        conferenceRoom.removeGuest(guest);
        assertEquals(0, conferenceRoom.getNumberOfGuests());
    }

}

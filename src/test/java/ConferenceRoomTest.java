import org.junit.Before;
import org.junit.Test;
import room.ConferenceRoom;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom("The Green Room", 24);
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

}

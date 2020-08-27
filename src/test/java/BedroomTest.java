import guest.Guest;
import org.junit.Before;
import org.junit.Test;
import room.Bedroom;
import room.RoomType;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;

    @Before
    public void before() {
        bedroom = new Bedroom(123, RoomType.SINGLE, 200);
        guest = new Guest("Rebeka");
    }

    @Test
    public void hasRoomNumber() {
        assertEquals(123, bedroom.getRoomNumber());
    }

    @Test
    public void hasRoomType() {
        assertEquals(RoomType.SINGLE, bedroom.getRoomType());
    }

    @Test
    public void hasCapacity() {
        assertEquals(1, bedroom.getCapacity());
    }

    @Test
    public void guestListStartsEmpty() {
        assertEquals(0, bedroom.getNumberOfGuests());
    }

    @Test
    public void canAddGuest() {
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.getNumberOfGuests());
    }

    @Test
    public void canRemoveGuest() {
        bedroom.addGuest(guest);
        bedroom.removeGuest(guest);
        assertEquals(0, bedroom.getNumberOfGuests());
    }

    @Test
    public void hasNightlyRate() {
        assertEquals(200, bedroom.getNightlyRate());
    }
}

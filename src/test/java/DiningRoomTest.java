import guest.Guest;
import org.junit.Before;
import org.junit.Test;
import room.DiningRoom;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {
    DiningRoom diningRoom;
    Guest guest;

    @Before
    public void before() {
        diningRoom = new DiningRoom("Rustic", 15);
        guest = new Guest("Tomek");
    }

    @Test
    public void hasName() {
        assertEquals("Rustic", diningRoom.getName());
    }

    @Test
    public void hasCapacity() {
        assertEquals(15, diningRoom.getCapacity());
    }

    @Test
    public void guestListStartsEmpty() {
        assertEquals(0, diningRoom.getNumberOfGuests());
    }

    @Test
    public void canAddGuest() {
        diningRoom.addGuest(guest);
        assertEquals(1, diningRoom.getNumberOfGuests());
    }

    @Test
    public void canRemoveGuest() {
        diningRoom.addGuest(guest);
        diningRoom.removeGuest(guest);
        assertEquals(0, diningRoom.getNumberOfGuests());
    }
}

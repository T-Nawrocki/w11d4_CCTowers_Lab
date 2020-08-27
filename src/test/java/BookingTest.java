import hotel.Booking;
import org.junit.Before;
import org.junit.Test;
import room.Bedroom;
import room.RoomType;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking;
    Bedroom bedroom;

    @Before
    public void before() {
        bedroom = new Bedroom(123, RoomType.DOUBLE, 200);
        booking = new Booking(bedroom, 3);
    }

    @Test
    public void hasBedroom() {
        assertEquals(bedroom, booking.getBedroom());
    }

    @Test
    public void hasNights() {
        assertEquals(3, booking.getNights());
    }

    @Test
    public void hasTotalPrice() {
        assertEquals(600, booking.totalPrice());
    }
}

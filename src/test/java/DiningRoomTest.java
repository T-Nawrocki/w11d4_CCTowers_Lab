import org.junit.Before;
import org.junit.Test;
import room.DiningRoom;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {
    DiningRoom diningRoom;

    @Before
    public void before() {
        diningRoom = new DiningRoom("Rustic", 15);

    }

    @Test
    public void hasName() {
        assertEquals("Rustic", diningRoom.getName());
    }
}

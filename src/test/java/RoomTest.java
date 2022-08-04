import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;

    @Before
    public void before(){
        room = new Bedroom(100, RoomType.SINGLE);
    }

    @Test
    public void canGetCapacity(){
        assertEquals(1, room.getCapacity());
    }

    @Test
    public void canGetListOfGuests(){
        assertEquals(0, room.getGuests().size());
    }
}

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    Bedroom bedroom4;

    @Before
    public void before(){
        bedroom1 = new Bedroom(101, RoomType.SINGLE);
        bedroom2 = new Bedroom(102, RoomType.DOUBLE);
        bedroom3 = new Bedroom(103, RoomType.TWIN);
        bedroom4 = new Bedroom(104, RoomType.FAMILY);
    }

    @Test
    public void canGetRoomType(){
        assertEquals(RoomType.SINGLE, bedroom1.getType());
        assertEquals(RoomType.DOUBLE, bedroom2.getType());
        assertEquals(RoomType.TWIN, bedroom3.getType());
        assertEquals(RoomType.FAMILY, bedroom4.getType());
    }

    @Test
    public void canGetBedroomNumber(){
        assertEquals(101, bedroom1.getRoomNumber());
    }
}

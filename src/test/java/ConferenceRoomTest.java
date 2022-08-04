import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceroom;

    @Before
    public void before(){
        conferenceroom = new ConferenceRoom("CR1", 100);
    }

    @Test
    public void canGetName(){
        assertEquals("CR1", conferenceroom.getName());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(100, conferenceroom.getCapacity());
    }



}

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Guest guest;

    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    Bedroom bedroom4;
    Room conferenceroom;

    @Before
    public void before(){
        bedroom1 = new Bedroom(101, RoomType.SINGLE);
        bedroom2 = new Bedroom(102, RoomType.DOUBLE);
        bedroom3 = new Bedroom(103, RoomType.TWIN);
        bedroom4 = new Bedroom(104, RoomType.FAMILY);
        conferenceroom = new ConferenceRoom("CR1", 100);
        ArrayList<Room> bedrooms = new ArrayList<>();
        ArrayList<Room> functionRooms = new ArrayList<>();
        bedrooms.add(bedroom1);
        bedrooms.add(bedroom2);
        bedrooms.add(bedroom3);
        bedrooms.add(bedroom4);
        functionRooms.add(conferenceroom);

        hotel = new Hotel("CodeClan Towers", bedrooms, functionRooms);
        guest = new Guest("Richard");
    }

    @Test
    public void canGetListOfBedrooms(){
        assertEquals(4, hotel.getNumberOfBedrooms());
    }

    @Test
    public void getNumberOfFunctionRooms(){
        assertEquals(1, hotel.getNumberOfFunctionRooms());
    }

    @Test
    public void canCheckGuestIntoRoom(){
        hotel.checkGuestIntoRoom(bedroom2, guest);
        assertEquals(1, bedroom2.getGuests().size());
    }




}

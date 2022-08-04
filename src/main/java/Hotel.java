import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Hotel {
    private String name;
    private ArrayList<Room> bedrooms;
    private ArrayList<Room> functionRooms;
    public Hotel(String name, ArrayList<Room> bedrooms, ArrayList<Room> functionRooms){
        this.name = name;
        this.bedrooms = bedrooms;
        this.functionRooms = functionRooms;
    }

    public int getNumberOfBedrooms(){
        return bedrooms.size();
    }
    public int getNumberOfFunctionRooms(){
        return functionRooms.size();
    }

    public void checkGuestIntoRoom(Room bedroom, Guest guest){
        bedroom.addGuests(guest);
    }

}

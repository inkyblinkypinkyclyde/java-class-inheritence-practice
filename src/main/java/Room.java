import java.util.ArrayList;

public abstract class Room {

    private ArrayList<Guest> guests;
    private int capacity;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public void addGuests(Guest guest) {
        if (capacity > this.guests.size()){
            this.guests.add(guest);
        }
    }

    public int getCapacity() {
        return capacity;
    }

}

import java.util.ArrayList;

public abstract class Room {

    private ArrayList <Guest> guests;
    private int capacity;

    public Room(int capacity){
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public int getGuests() {
        return guests.size();
    }

    public void addGuest(Guest guest){
        this.guests.add(guest);

    }

    public void removeGuest(Guest guest){
        this.guests.remove(guest);
    }

}

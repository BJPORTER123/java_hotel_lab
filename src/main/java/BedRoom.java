import java.util.ArrayList;

public class BedRoom extends Room{

    private int roomNumber;
    private RoomType roomType;

    public BedRoom(int roomNumber, int capacity, RoomType roomType){
        super(capacity);
        this.roomType = roomType;
        this.roomNumber = roomNumber;

    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getMaxRoomCapacity() {
        return roomType.getRoomCapacity();
    }
}

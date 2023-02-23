import java.util.ArrayList;

public class Hotel{

    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<BedRoom> bedRooms;
    private String hotelName;

    public Hotel(String hotelName){
        this.hotelName = hotelName;
        this.conferenceRooms = new ArrayList<>();
        this.bedRooms = new ArrayList<>();
    }

    public String getHotelName() {
        return hotelName;
    }


}

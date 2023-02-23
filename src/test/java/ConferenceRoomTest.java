import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    Guest guest1;
    Guest guest2;
    Guest guest3;

    @Before

    public void setUp(){
        conferenceRoom = new ConferenceRoom("Porter suite", 10);
        guest1 = new Guest("Ben");
        guest2 = new Guest("Colette");
        guest3 = new Guest("Alex");
    }

    @Test
    public void canGetName(){
        assertEquals("Porter suite", conferenceRoom.getName());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(10, conferenceRoom.getCapacity());
    }

    @Test
    public void canAddGuests(){
        conferenceRoom.addGuest(guest1);
        assertEquals(1, conferenceRoom.getGuests());
    }
    @Test
    public void canRemoveGuests(){
        conferenceRoom.addGuest(guest1);
        conferenceRoom.addGuest(guest2);
        conferenceRoom.removeGuest(guest1);
        assertEquals(1, conferenceRoom.getGuests());
    }

}

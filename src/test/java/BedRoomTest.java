import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedRoomTest {

    BedRoom bedRoom1;

    @Before

    public void setUp(){
        bedRoom1 = new BedRoom(10,2, RoomType.DOUBLE);
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(10, bedRoom1.getRoomNumber());
    }

    @Test
    public void canGetMaxRoomCapacity(){
        assertEquals(2, bedRoom1.getMaxRoomCapacity());
    }



}

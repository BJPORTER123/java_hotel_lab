import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;

    @Before

    public void setUp(){
        hotel = new Hotel("Transylvania");
    }

    @Test
    public void canGetHotelName(){
        assertEquals("Transylvania",hotel.getHotelName());

    }

}

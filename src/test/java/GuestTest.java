import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class GuestTest {
    Guest guest;

    @Before

    public void setUp(){
        guest = new Guest("Colette");
    }

    @Test
    public void canGetName(){
        assertEquals("Colette", guest.getGuestName());
    }
}

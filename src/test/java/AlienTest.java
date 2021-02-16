import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;


public class AlienTest {

    Alien alien;

    @Before
    public void before() {
        alien = new Alien(42.42);
    }

    @Test
    public void hasSpaceMoney() {
        assertEquals(42.42, alien.getSpaceMoney(), 0.0);
    }

    @Test
    public void ownedVehiclesListStartsEmpty(){
        assertEquals(0, alien.getOwnedVehicles());
    }


}

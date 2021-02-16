import People.Alien;
import org.junit.Before;
import org.junit.Test;
import vehicles.EngineType;
import vehicles.FlyingSaucer;
import vehicles.GearboxType;

import static org.junit.Assert.assertEquals;

public class FlyingSaucerTest {

    FlyingSaucer flyingSaucer;

    @Before
    public void before(){
        flyingSaucer = new FlyingSaucer(1000000, "space grey", EngineType.IONDRIVE, GearboxType.ROCKET,
                "Wow! This thing is full of space juice!");

    }

    @Test
    public void canGetMinifridge(){
        assertEquals("Wow! This thing is full of space juice!", flyingSaucer.getMinifridge());
    }

    @Test
    public void canAbduct(){
        Alien abductee = new Alien(500.0);
        flyingSaucer.abduct(abductee);
        assertEquals(1, flyingSaucer.getAbudcteeCount());
    }

}

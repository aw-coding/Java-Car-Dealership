import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import vehicles.EngineType;
import vehicles.GearboxType;
import vehicles.HybridCar;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {

    HybridCar hybridCar;

    @Before
    public void before() {
        hybridCar = new HybridCar(6000, "mauve", EngineType.HYBRID, GearboxType.AUTOMATIC, "WOW! A minifridge!!!");
    }

    @Test
    public void canGetMinifridge() {
        assertEquals("WOW! A minifridge!!!", hybridCar.getMinifridge());
    }
}

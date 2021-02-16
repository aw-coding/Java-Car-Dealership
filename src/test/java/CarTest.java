import org.junit.Before;
import org.junit.Test;
import vehicles.Car;
import vehicles.EngineType;
import vehicles.GearboxType;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;

    @Before
    public void before(){
        car = new Car(5000, "red", EngineType.PETROL, GearboxType.MANUAL);
    }

    @Test
    public void hasPrice(){
        assertEquals(5000, car.getPrice());
    }

    @Test
    public void hasColour(){
        assertEquals("red", car.getColour());
    }

    @Test
    public void hasEngineType(){
        assertEquals(EngineType.PETROL, car.getEngineType());
    }

    @Test
    public void hasGearboxType(){
        assertEquals(GearboxType.MANUAL, car.getGearboxType());
    }




}

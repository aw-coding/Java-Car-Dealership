import People.Alien;
import org.junit.Before;
import org.junit.Test;
import vehicles.Car;
import vehicles.EngineType;
import vehicles.GearboxType;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;


public class AlienTest {

    Alien alien;
    Car car;

    @Before
    public void before() {
        alien = new Alien(42.42);
        car = new Car(5, "red", EngineType.PETROL, GearboxType.MANUAL);
    }

    @Test
    public void hasSpaceMoney() {
        assertEquals(42.42, alien.getSpaceMoney(), 0.0);
    }

    @Test
    public void ownedVehiclesListStartsEmpty(){
        assertEquals(0, alien.getOwnedVehicles());
    }

    @Test
    public void canAddCarToList() {
        alien.addCar(car);
        assertEquals(1, alien.getOwnedVehicles());
    }

    @Test
    public void canBuyCar(){
        alien.buyVehicle(car);
        assertEquals(37.42, alien.getSpaceMoney(), 0.0);

    }



}

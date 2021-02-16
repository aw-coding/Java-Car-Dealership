import org.junit.Before;
import org.junit.Test;
import vehicles.Car;
import vehicles.EngineType;
import vehicles.GearboxType;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Car car1;
    Car car2;
    private Object ArrayList;
    ArrayList<Car> cars;


    @Before
    public void before(){
        car1 = new Car(5000, "red", EngineType.PETROL, GearboxType.MANUAL);
        car2 = new Car(2000, "blue", EngineType.PETROL, GearboxType.MANUAL);
        //cars.add(car1)

        dealership = new Dealership(20000, cars);

    }

    @Test
    public void getTillAmount(){
        assertEquals(20000, dealership.getTillAmount(), 0.0);
    }

    public void canGetNumberOfCarsInStock(){
        dealership.addCar(car1);
        dealership.addCar(car2);
        assertEquals(2, dealership.getNumberOfCarsInStock());
    }
}

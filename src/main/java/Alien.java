import vehicles.Car;
import java.util.ArrayList;



public class Alien {

    private double spaceMoney;
    private ArrayList<Car> ownedVehicles;

    public Alien(double spaceMoney) {
        this.spaceMoney = spaceMoney;
        this.ownedVehicles = new ArrayList<Car>();

    }

    public double getSpaceMoney() {
        return this.spaceMoney;
    }

    public int getOwnedVehicles() {
        return this.ownedVehicles.size();
    }

    public void addCar(Car car) {
        this.ownedVehicles.add(car);

    }
}

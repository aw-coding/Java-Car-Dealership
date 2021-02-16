import vehicles.Car;

import java.util.ArrayList;

public class Dealership {

    private double till;
    private ArrayList<Car> cars;

    public Dealership(double till, ArrayList<Car> cars){
        this.till = till;
        this.cars = new ArrayList<Car>();
    }

    public double getTillAmount() {
        return this.till;
    }

    public void addCar(Car car){
        cars.add(car);
    }

    public int getNumberOfCarsInStock() {
        return this.cars.size();
    }


    public void buyVehicle(Car car) {
        if(this.till >= car.getPrice()) {
            this.till -= car.getPrice();
            this.addCar(car);
        }
    }
}

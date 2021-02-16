package vehicles;

public class Car {

    private int price;
    private String colour;
    private EngineType engine;
    private GearboxType gearbox;

    public Car(int price, String colour, EngineType engine, GearboxType gearbox){
        this.price = price;
        this.colour = colour;
        this.engine = engine;
        this.gearbox= gearbox;
    }


    public int getPrice() {
        return this.price;
    }

    public String getColour() {
        return this.colour;
    }

    public EngineType getEngineType() {
        return this.engine;
    }

    public GearboxType getGearboxType() {
        return this.gearbox;
    }
}

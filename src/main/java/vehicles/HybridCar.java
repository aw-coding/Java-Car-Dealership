package vehicles;

public class HybridCar extends Car{

    private String miniFridge;

    public HybridCar(int price, String colour, EngineType engine, GearboxType gearbox, String miniFridge){
        super(price, colour, engine, gearbox);
        this.miniFridge = miniFridge;
    }

    public String getMinifridge() {
        return this.miniFridge;

    }
}

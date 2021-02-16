
package vehicles;
import People.Alien;



import java.util.ArrayList;


public class FlyingSaucer extends HybridCar{
    private ArrayList<Alien> abductees;

    public FlyingSaucer(int price, String colour, EngineType engine, GearboxType gearbox, String miniFridge){
        super(price, colour, engine, gearbox, miniFridge);
        this.abductees = new ArrayList<Alien>();


    }




}

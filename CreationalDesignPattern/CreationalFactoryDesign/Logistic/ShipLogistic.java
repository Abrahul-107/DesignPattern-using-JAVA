package CreationalDesignPattern.CreationalFactoryDesign.Logistic;

import CreationalDesignPattern.CreationalFactoryDesign.transport.Ship;
import CreationalDesignPattern.CreationalFactoryDesign.transport.Transport;

public class ShipLogistic extends Logistics
{
    public Transport createTransport()
    {
        System.out.println("Creting Ship object");
        return new Ship();
    }
}

package CreationalDesignPattern.CreationalFactoryDesign.Logistic;

import CreationalDesignPattern.CreationalFactoryDesign.transport.Bus;
import CreationalDesignPattern.CreationalFactoryDesign.transport.Transport;

public class BusLogistic extends Logistics 
{
    public Transport createTransport()
    {
        // Create a Bike object as the specific Transport
        System.out.println("Creting Bus object");
        return new Bus();
    }
    
}

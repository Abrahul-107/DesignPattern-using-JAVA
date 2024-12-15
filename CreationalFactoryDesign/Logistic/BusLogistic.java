package CreationalFactoryDesign.Logistic;

import CreationalFactoryDesign.transport.Bus;
import CreationalFactoryDesign.transport.Transport;

public class BusLogistic extends Logistics 
{
    public Transport createTransport()
    {
        // Create a Bike object as the specific Transport
        System.out.println("Creting Bus object");
        return new Bus();
    }
    
}

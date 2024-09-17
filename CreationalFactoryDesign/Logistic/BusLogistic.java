package CreationalFactoryDesign.Logistic;

import CreationalFactoryDesign.transport.Bus;
import CreationalFactoryDesign.transport.Transport;

public class BusLogistic extends Logistics 
{
    public Transport createTransport()
    {
        // Create a Bike object as the specific Transport
        return new Bus();
    }
    
}

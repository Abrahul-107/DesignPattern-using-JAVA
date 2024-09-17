package CreationalFactoryDesign.Logistic;

import CreationalFactoryDesign.transport.Car;
import CreationalFactoryDesign.transport.Transport;

public class CarLogistic extends Logistics
{
    public Transport createTransport()
    {
        // Create a Car object as the specific Transport
        return new Car();
    }
}

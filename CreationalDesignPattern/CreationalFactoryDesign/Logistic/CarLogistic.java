package CreationalDesignPattern.CreationalFactoryDesign.Logistic;

import CreationalDesignPattern.CreationalFactoryDesign.transport.Car;
import CreationalDesignPattern.CreationalFactoryDesign.transport.Transport;

public class CarLogistic extends Logistics
{
    public Transport createTransport()
    {
        // Create a Car object as the specific Transport
        System.out.println("Creting car object");
        return new Car();
    }
}

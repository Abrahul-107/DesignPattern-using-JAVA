package CreationalFactoryDesign.Logistic;

import CreationalFactoryDesign.transport.Ship;
import CreationalFactoryDesign.transport.Transport;

public class ShipLogistic extends Logistics
{
    public Transport createTransport()
    {
        return new Ship();
    }
}

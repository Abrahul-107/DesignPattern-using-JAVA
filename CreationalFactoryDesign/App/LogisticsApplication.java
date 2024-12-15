package CreationalFactoryDesign.App;

import CreationalFactoryDesign.Logistic.BusLogistic;
import CreationalFactoryDesign.Logistic.CarLogistic;
import CreationalFactoryDesign.Logistic.Logistics;
import CreationalFactoryDesign.Logistic.ShipLogistic;

public class LogisticsApplication 
{
    private Logistics logistics;
    
    public void initialize(String type)
    {
        if(type.equalsIgnoreCase("car"))
            logistics = new CarLogistic();
        else if(type.equalsIgnoreCase("Bus"))
            logistics = new BusLogistic();
        else if(type.equalsIgnoreCase("Ship"))
            logistics = new ShipLogistic();
        else
            throw new IllegalArgumentException("Unknown logistic type");
    }
    public void run(String type)
    {
        this.initialize(type);
        logistics.planDelivery();
    }
    public static void main(String[] args) 
    {
        LogisticsApplication app = new LogisticsApplication();
        app.run("Bus");
        app.run("Car");
        app.run("Ship");
        
    }

    
}

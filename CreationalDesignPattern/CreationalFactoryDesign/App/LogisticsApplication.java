package CreationalDesignPattern.CreationalFactoryDesign.App;
import CreationalDesignPattern.CreationalFactoryDesign.Logistic.Logistics;


public class LogisticsApplication 
{
    private Logistics logistics;

    public void run(String type) 
    {
        // Use the factory to create logistics objects
        LogisticsFactory factory = new LogisticsFactory();
        logistics = factory.createLogistics(type);
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

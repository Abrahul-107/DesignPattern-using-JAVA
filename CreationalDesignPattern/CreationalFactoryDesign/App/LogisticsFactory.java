package CreationalDesignPattern.CreationalFactoryDesign.App;

import CreationalDesignPattern.CreationalFactoryDesign.Logistic.*;;

// Factory Class
class LogisticsFactory {
    //Factory method
    public Logistics createLogistics(String type) 
    {
        switch (type.toLowerCase()) 
        {
            case "car":
                return new CarLogistic();
            case "bus":
                return new BusLogistic();
            case "ship":
                return new ShipLogistic();
            default:
                throw new IllegalArgumentException("Unknown logistic type: " + type);
        }
    }
}

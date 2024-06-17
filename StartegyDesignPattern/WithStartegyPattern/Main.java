package StartegyDesignPattern.WithStartegyPattern;

public class Main 
{
    public static void main(String[] args) 
    {
        Vehicle vehicle = new OffroadVehicle();
        vehicle.drive();
        vehicle = new GoodsVehicle();
        vehicle.drive();
    }
    
}

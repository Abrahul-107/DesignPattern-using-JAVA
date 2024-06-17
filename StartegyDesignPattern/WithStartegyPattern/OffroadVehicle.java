package StartegyDesignPattern.WithStartegyPattern;

import StartegyDesignPattern.WithStartegyPattern.startegies.SportsDriveStartegy;

public class OffroadVehicle extends Vehicle
{
    OffroadVehicle()
    {
        super(new SportsDriveStartegy());
    }
    
}

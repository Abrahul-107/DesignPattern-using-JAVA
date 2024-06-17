package StartegyDesignPattern.WithStartegyPattern;

import StartegyDesignPattern.WithStartegyPattern.startegies.SportsDriveStartegy;

public class SportsVehicle extends Vehicle 
{
    SportsVehicle()
    {
        super(new SportsDriveStartegy());
    }
    
}

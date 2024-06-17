package StartegyDesignPattern.WithStartegyPattern;

import StartegyDesignPattern.WithStartegyPattern.startegies.DriveStartegy;

public class Vehicle 
{
    DriveStartegy driveStartegyObj;

    Vehicle(DriveStartegy driveObj )
    {
        this.driveStartegyObj = driveObj;
    }
    public void drive()
    {
        driveStartegyObj.drive();

    }
}

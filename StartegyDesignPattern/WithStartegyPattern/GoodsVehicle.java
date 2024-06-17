package StartegyDesignPattern.WithStartegyPattern;

import StartegyDesignPattern.WithStartegyPattern.startegies.NormalDriveStartegy;

public class GoodsVehicle extends Vehicle
{
    GoodsVehicle()
    {
        super(new NormalDriveStartegy());
    }
}

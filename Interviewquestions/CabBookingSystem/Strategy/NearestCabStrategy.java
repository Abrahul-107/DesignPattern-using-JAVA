package Interviewquestions.CabBookingSystem.Strategy;
import java.util.List;

import Interviewquestions.CabBookingSystem.Model.Driver;

interface BookingStrategy 
{
    Driver findDriver(List<Driver> drivers);
}

public class NearestCabStrategy implements BookingStrategy 
{
    @Override
    public Driver findDriver(List<Driver> drivers) 
    {
        for (Driver d : drivers) 
        {
            if (d.getCab().isAvailable) 
            {
                return d;
            }
        }
        return null;
    }
}

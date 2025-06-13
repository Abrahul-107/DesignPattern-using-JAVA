package Interviewquestions.CabBookingSystem.Factory;

import Interviewquestions.CabBookingSystem.Model.Ride;
import Interviewquestions.CabBookingSystem.Model.Passenger;
import Interviewquestions.CabBookingSystem.Model.Driver;
import Interviewquestions.CabBookingSystem.Model.Cab;



public class RideFactory 
{
    public static Ride createRide(Driver driver, Passenger passenger, Cab cab) 
    {
        return new Ride(driver, passenger, cab);
    }
}

package Interviewquestions.CabBookingSystem.Service;

import java.util.ArrayList;
import java.util.List;
import Interviewquestions.CabBookingSystem.Strategy.NearestCabStrategy;
import Interviewquestions.CabBookingSystem.Factory.RideFactory;
import Interviewquestions.CabBookingSystem.Model.Cab;
import Interviewquestions.CabBookingSystem.Model.Driver;
import Interviewquestions.CabBookingSystem.Model.Passenger;
import Interviewquestions.CabBookingSystem.Model.Ride;

public class CabBookingSystemDriver 
{
    private static CabBookingSystemDriver instance = null;

    private List<Driver> drivers = new ArrayList<>();
    private List<Passenger> passengers = new ArrayList<>();
    private List<Ride> rides = new ArrayList<>();
    private NearestCabStrategy bookingStrategy = new NearestCabStrategy();

    private CabBookingSystemDriver() {}

    public static CabBookingSystemDriver getInstance() 
    {
        if (instance == null) 
        {
            instance = new CabBookingSystemDriver();
        }
        return instance;
    }

    public void addCab(Cab cab, Driver driver) 
    {
        driver.setCab(cab);
        drivers.add(driver);
        System.out.println("Cab added for driver: " + driver.getName());
    }

    public void bookRide(Passenger passenger) 
    {
        Driver driver = bookingStrategy.findDriver(drivers);
        if (driver == null) 
        {
            System.out.println("No cabs available right now.");
            return;
        }

        Ride ride = RideFactory.createRide(driver, passenger, driver.getCab());
        driver.getCab().isAvailable = false;
        rides.add(ride);
        passengers.add(passenger);
        System.out.println("Ride booked: " + passenger.getName() + " with driver " + driver.getName());
    }

    public void endRide(Passenger passenger) 
    {
        for (Ride ride : rides) 
        {
            if (ride.passenger.equals(passenger) && ride.getEndTime() == null) {
                ride.endRide();
                System.out.println("Ride ended for passenger: " + passenger.name);
                return;
            }
        }
        System.out.println("No active ride found for passenger: " + passenger.name);
    }

    public void displayDetails() {
        System.out.println("=== All Ride Details ===");
        for (Ride ride : rides) {
            System.out.println("Passenger: " + ride.passenger.getName() +
                    ", Driver: " + ride.driver.getName() +
                    ", Cab: " + ride.getCab().getModel() +
                    ", Start: " + ride.getStartTime() +
                    ", End: " + (ride.endTime != null ? ride.endTime : "In Progress"));
        }
    }
}

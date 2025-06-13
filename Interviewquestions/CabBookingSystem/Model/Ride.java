package Interviewquestions.CabBookingSystem.Model;

public class Ride 
{
    public Driver driver;
    public Passenger passenger;
    Cab cab;
    String startTime;
    public String endTime;

    public Ride(Driver driver, Passenger passenger, Cab cab) 
    {
        this.driver = driver;
        this.passenger = passenger;
        this.cab = cab;
        this.startTime = java.time.LocalTime.now().toString();
        this.endTime = null;
    }

    public void endRide() 
    {
        this.endTime = java.time.LocalTime.now().toString();
        this.cab.isAvailable = true;
    }

    public Driver getDriver() {
        return driver;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public Cab getCab() {
        return cab;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }
    
}
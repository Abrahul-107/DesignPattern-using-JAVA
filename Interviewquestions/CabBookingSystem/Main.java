package Interviewquestions.CabBookingSystem;

import Interviewquestions.CabBookingSystem.Model.Cab;
import Interviewquestions.CabBookingSystem.Model.Driver;
import Interviewquestions.CabBookingSystem.Model.Passenger;

import Interviewquestions.CabBookingSystem.Service.CabBookingSystemDriver;

public class Main {
    public static void main(String[] args) {
        CabBookingSystemDriver system = CabBookingSystemDriver.getInstance();

        // Add Cabs and Drivers
        system.addCab(new Cab("CAB1", "Toyota"), new Driver("D1", "John"));
        system.addCab(new Cab("CAB2", "Honda"), new Driver("D2", "Alice"));

        // Book Rides
        Passenger p1 = new Passenger("P1", "Rahul");
        system.bookRide(p1);

        Passenger p2 = new Passenger("P2", "Sneha");
        system.bookRide(p2);

        // End Ride for Passenger 1
        system.endRide(p1);

        // Display All Details
        system.displayDetails();
    }
}

package Interviewquestions.CabBookingSystem.Model;

public class Passenger 
{
    String id;
    public String name;

    public Passenger(String id, String name) 
    {
        this.id = id;
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public String getId()
    {
        return id;
    }
}

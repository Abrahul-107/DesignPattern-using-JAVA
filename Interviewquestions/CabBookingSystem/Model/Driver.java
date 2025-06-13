package Interviewquestions.CabBookingSystem.Model;

public class Driver 
{
    String id;
    private String name;
    private Cab cab;

    public Driver(String id, String name) 
    {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cab getCab() {
        return cab;
    }

    public void setCab(Cab cab) {
        this.cab = cab;
    }
}
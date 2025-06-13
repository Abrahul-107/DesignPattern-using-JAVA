package Interviewquestions.CabBookingSystem.Model;

public class Cab 
{
    String id;
    String model;
    public boolean isAvailable;

    public Cab(String id, String model) 
    {
        this.id = id;
        this.model = model;
        this.isAvailable = true;
    }
    public boolean isAvalibaleCab()
    {
        return isAvailable;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}



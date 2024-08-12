package DecoratorPattern.Java.SimpleCoffee;

public class SimpleCoffee implements Coffee
{
    public int getCost()
    {
        return 10;
    }
    public String getDescription()
    {
        return "This is simple coffee";
    }
    
}   

package StartegyDesignPattern.WithoutStartegyPattern;

public class SportVehicle extends Vehicle
{
    public void drive()
    {
        /*Same as off roading vehicles so here we nshduplicating the code instead of reusing that code so 
        Now we need startegy design pattern by which we can reuse and optimize the code quality 
        so instead of is-A relationship now we are going to use Has-A relationship in the startegy design pattern */
        System.out.println("Offroading and sports  ability  ");
    }
    
}

package DecoratorPattern.Java;

import DecoratorPattern.Java.Decorators.MilkCoffee;
import DecoratorPattern.Java.Decorators.VanillaCoffee;
import DecoratorPattern.Java.Decorators.WhipCoffee;
import DecoratorPattern.Java.SimpleCoffee.Coffee;
import DecoratorPattern.Java.SimpleCoffee.SimpleCoffee;

public class Main 
{
    public static void main(String[] args) 
    {
        Coffee myCoffee = new SimpleCoffee();
        System.out.println(myCoffee.getDescription());
        System.out.println("Initial cost: $" + myCoffee.getCost());
        
        myCoffee = new MilkCoffee(myCoffee);
        System.out.println(myCoffee.getDescription());
        System.out.println("Cost with milk: $" + myCoffee.getCost());

        myCoffee = new VanillaCoffee(myCoffee);
        System.out.println(myCoffee.getDescription());
        System.out.println("Cost with vanilla flavour is $"+myCoffee.getCost());

        myCoffee = new WhipCoffee(myCoffee);
        System.out.println(myCoffee.getDescription());
        System.out.println("Cost of whip coffe is  "+myCoffee.getCost());
        
    }
}

package DecoratorPattern;

import DecoratorPattern.SimpleCoffee.Coffee;
import DecoratorPattern.SimpleCoffee.SimpleCoffee;
import DecoratorPattern.Decorators.MilkCoffee;
import DecoratorPattern.Decorators.VanillaCoffee;
import DecoratorPattern.Decorators.WhipCoffee;

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

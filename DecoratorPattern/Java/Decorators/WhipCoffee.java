package DecoratorPattern.Java.Decorators;

import DecoratorPattern.Java.SimpleCoffee.Coffee;


/**
 * The {@code WhipCoffee} class is a concrete decorator that adds milk to a {@link Coffee} object.
 * It extends the {@link SimplecoffeeDecorator} abstract class, adding additional cost and description for milk.
 */
public class WhipCoffee extends SimplecoffeeDecorator
{

    /**
     * Constructs a {@code WhipCoffee} object with the specified {@link Coffee}.
    *
    * @param coffee the {@link Coffee} object to be decorated with milk
    */
    public WhipCoffee(Coffee coffee)
    {
        super(coffee);
    }


    /**
     * Returns the cost of the coffee with milk added.
     * <p>
     * This method overrides the {@code getCost()} method from {@link SimplecoffeeDecorator} to
     * add the cost of Whip to the base cost of the coffee.
     * </p>
     *
     * @return the cost of the coffee with Whip
     */

    @Override
    public int getCost()
    {
        return coffee.getCost()+5;
    }

    /**
     * Returns the description of the coffee with milk added.
     * <p>
     * This method overrides the {@code getDescription()} method from {@link SimplecoffeeDecorator} to
     * append ", Whip" to the base description of the coffee.
     * </p>
     *
     * @return the description of the coffee with Whip
     */
    @Override
    public String getDescription()
    {
        return coffee.getDescription() + " Added with whip";
    }
    
}

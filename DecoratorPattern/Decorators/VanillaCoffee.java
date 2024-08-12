package DecoratorPattern.Decorators;

import DecoratorPattern.SimpleCoffee.Coffee;

/**
 * The {@code VanillaCoffee} class is a concrete decorator that adds milk to a {@link Coffee} object.
 * It extends the {@link SimplecoffeeDecorator} abstract class, adding additional cost and description for milk.
 */
public class VanillaCoffee extends SimplecoffeeDecorator
{
    /**
     * Constructs a {@code VanillaCoffee} object with the specified {@link Coffee}.
    *
    * @param coffee the {@link Coffee} object to be decorated with milk
    */
    public VanillaCoffee(Coffee coffee)
    {
        super(coffee);
    }

    /**
     * Returns the cost of the coffee with milk added.
     * <p>
     * This method overrides the {@code getCost()} method from {@link SimplecoffeeDecorator} to
     * add the cost of Vanilla to the base cost of the coffee.
     * </p>
     *
     * @return the cost of the coffee with Vanilla
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
     * append ", Vanilla" to the base description of the coffee.
     * </p>
     *
     * @return the description of the coffee with Vanilla
     */
    @Override
    public String getDescription()
    {
        return coffee.getDescription()+ " Added with vanilla ";
    }
}
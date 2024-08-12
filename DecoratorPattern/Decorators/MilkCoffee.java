package DecoratorPattern.Decorators;

import DecoratorPattern.SimpleCoffee.Coffee;


/**
 * The {@code MilkCoffee} class is a concrete decorator that adds milk to a {@link Coffee} object.
 * It extends the {@link CoffeeDecorator} abstract class, adding additional cost and description for milk.
 */
public class MilkCoffee extends SimplecoffeeDecorator
{

     /**
     * Constructs a {@code MilkCoffee} object with the specified {@link Coffee}.
     *
     * @param coffee the {@link Coffee} object to be decorated with milk
     */
    public MilkCoffee(Coffee coffee)
    {
        super(coffee);
    }
    /**
     * Returns the cost of the coffee with milk added.
     * <p>
     * This method overrides the {@code getCost()} method from {@link CoffeeDecorator} to
     * add the cost of milk to the base cost of the coffee.
     * </p>
     *
     * @return the cost of the coffee with milk
     */

    @Override
    public int getCost()
    {
        return coffee.getCost() + 5;
    }

    /**
     * Returns the description of the coffee with milk added.
     * <p>
     * This method overrides the {@code getDescription()} method from {@link CoffeeDecorator} to
     * append ", milk" to the base description of the coffee.
     * </p>
     *
     * @return the description of the coffee with milk
     */
    @Override
    public String getDescription()
    {
        return coffee.getDescription() + " Added with milk";
    }
}

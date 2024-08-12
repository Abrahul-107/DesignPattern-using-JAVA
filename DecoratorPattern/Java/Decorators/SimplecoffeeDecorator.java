package DecoratorPattern.Java.Decorators;

import DecoratorPattern.Java.SimpleCoffee.Coffee;


/**
 * The {@code SimplecoffeeDecorator} class is an abstract decorator for {@link Coffee} objects.
 * It provides a base implementation for decorators that add additional features or modifications
 * to a {@link Coffee} object.
 * <p>
 * This class holds a reference to a {@link Coffee} object and delegates method calls to it.
 * Concrete decorators will extend this class to add specific functionalities.
 * </p>
 */
public abstract class SimplecoffeeDecorator implements Coffee
{
     /**
     * The {@link Coffee} object to which additional features are added.
     */
    protected final Coffee coffee;

     /**
     * Constructs a {@code SimplecoffeeDecorator} with the specified {@link Coffee}.
     *
     * @param coffee the {@link Coffee} object to be decorated
     */
    public SimplecoffeeDecorator(Coffee coffee)
    {
        this.coffee = coffee;
    }

     /**
     * Returns the cost of the decorated {@link Coffee}.
     * <p>
     * This method delegates the call to the base {@link Coffee} object. Concrete decorators
     * may override this method to add additional cost.
     * </p>
     *
     * @return the cost of the coffee
     */
    public int getCost()
    {
        return coffee.getCost();
    }

    /**
     * Returns the description of the decorated {@link Coffee}.
     * <p>
     * This method delegates the call to the base {@link Coffee} object. Concrete decorators
     * may override this method to add additional description.
     * </p>
     *
     * @return the description of the coffee
     */
    public String getDescription()
    {
        return coffee.getDescription();
    }
}

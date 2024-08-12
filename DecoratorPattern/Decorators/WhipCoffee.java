package DecoratorPattern.Decorators;

import DecoratorPattern.SimpleCoffee.Coffee;

public class WhipCoffee extends SimplecoffeeDecorator
{
    public WhipCoffee(Coffee coffee)
    {
        super(coffee);
    }
    @Override
    public int getCost()
    {
        return coffee.getCost()+5;
    }
    @Override
    public String getDescription()
    {
        return coffee.getDescription() + " Added with whip";
    }
    
}

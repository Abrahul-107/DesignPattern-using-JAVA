package Solid_principle.LiskovSubstitution_Principle;

import java.util.HashMap;
import java.util.Map;

// Enum for Coffee Selection
enum CoffeeSelection {
    FILTER_COFFEE,
    ESPRESSO
}

// Base Class for Coffee Machines
abstract class CoffeeMachine {
    public abstract CoffeeDrink brewCoffee(CoffeeSelection selection) throws CoffeeException;

    public abstract void addCoffee(CoffeeSelection selection, Object coffee) throws CoffeeException;
}

// Coffee Drink Class
class CoffeeDrink {
    private CoffeeSelection selection;
    private int quantityWater;

    public CoffeeDrink(CoffeeSelection selection, int quantityWater) {
        this.selection = selection;
        this.quantityWater = quantityWater;
    }

    @Override
    public String toString() {
        return "CoffeeDrink{" +
                "selection=" + selection +
                ", quantityWater=" + quantityWater +
                '}';
    }
}

// Configuration Class
class Configuration {
    private int quantityCoffee;
    private int quantityWater;

    public Configuration(int quantityCoffee, int quantityWater) {
        this.quantityCoffee = quantityCoffee;
        this.quantityWater = quantityWater;
    }

    public int getQuantityCoffee() {
        return quantityCoffee;
    }

    public int getQuantityWater() {
        return quantityWater;
    }
}

// Coffee Bean Class
class CoffeeBean {
    private String name;
    private int quantity;

    public CoffeeBean(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

// Ground Coffee Class
class GroundCoffee {
    private String name;
    private int quantity;

    public GroundCoffee(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

// Brewing Unit Class
class BrewingUnit {
    public CoffeeDrink brew(CoffeeSelection selection, Object coffee, int quantityWater) {
        return new CoffeeDrink(selection, quantityWater);
    }
}

// Grinder Class
class Grinder {
    public GroundCoffee grind(CoffeeBean beans, int quantity) {
        return new GroundCoffee(beans.getName(), quantity);
    }
}

// Coffee Exception Class
class CoffeeException extends Exception {
    public CoffeeException(String message) {
        super(message);
    }
}

// Basic Coffee Machine Class
class BasicCoffeeMachine extends CoffeeMachine {
    private Map<CoffeeSelection, GroundCoffee> groundCoffee;
    private BrewingUnit brewingUnit;
    private Map<CoffeeSelection, Configuration> configMap;

    public BasicCoffeeMachine(Map<CoffeeSelection, GroundCoffee> coffee) {
        this.groundCoffee = coffee;
        this.brewingUnit = new BrewingUnit();
        this.configMap = new HashMap<>();
        this.configMap.put(CoffeeSelection.FILTER_COFFEE, new Configuration(30, 480));
    }

    @Override
    public CoffeeDrink brewCoffee(CoffeeSelection selection) throws CoffeeException {
        if (selection == CoffeeSelection.FILTER_COFFEE) {
            return brewFilterCoffee();
        } else {
            throw new CoffeeException("CoffeeSelection [" + selection + "] not supported!");
        }
    }

    private CoffeeDrink brewFilterCoffee() {
        Configuration config = configMap.get(CoffeeSelection.FILTER_COFFEE);
        GroundCoffee groundCoffee = this.groundCoffee.get(CoffeeSelection.FILTER_COFFEE);
        return this.brewingUnit.brew(CoffeeSelection.FILTER_COFFEE, groundCoffee, config.getQuantityWater());
    }

    @Override
    public void addCoffee(CoffeeSelection selection, Object coffee) throws CoffeeException {
        if (!(coffee instanceof GroundCoffee)) {
            throw new CoffeeException("Invalid coffee type for BasicCoffeeMachine.");
        }

        GroundCoffee newCoffee = (GroundCoffee) coffee;
        GroundCoffee existingCoffee = this.groundCoffee.get(selection);

        if (existingCoffee != null) {
            if (existingCoffee.getName().equals(newCoffee.getName())) {
                existingCoffee.setQuantity(existingCoffee.getQuantity() + newCoffee.getQuantity());
            } else {
                throw new CoffeeException("Only one kind of coffee supported for each CoffeeSelection.");
            }
        } else {
            this.groundCoffee.put(selection, newCoffee);
        }
    }
}

// Premium Coffee Machine Class
class PremiumCoffeeMachine extends CoffeeMachine {
    private Map<CoffeeSelection, CoffeeBean> beans;
    private Grinder grinder;
    private BrewingUnit brewingUnit;
    private Map<CoffeeSelection, Configuration> configMap;

    public PremiumCoffeeMachine(Map<CoffeeSelection, CoffeeBean> beans) {
        this.beans = beans;
        this.grinder = new Grinder();
        this.brewingUnit = new BrewingUnit();
        this.configMap = new HashMap<>();
        this.configMap.put(CoffeeSelection.FILTER_COFFEE, new Configuration(30, 480));
        this.configMap.put(CoffeeSelection.ESPRESSO, new Configuration(8, 28));
    }

    @Override
    public CoffeeDrink brewCoffee(CoffeeSelection selection) throws CoffeeException {
        switch (selection) {
            case FILTER_COFFEE:
                return brewFilterCoffee();
            case ESPRESSO:
                return brewEspresso();
            default:
                throw new CoffeeException("CoffeeSelection [" + selection + "] not supported!");
        }
    }

    private CoffeeDrink brewFilterCoffee() {
        Configuration config = configMap.get(CoffeeSelection.FILTER_COFFEE);
        GroundCoffee groundCoffee = this.grinder.grind(this.beans.get(CoffeeSelection.FILTER_COFFEE), config.getQuantityCoffee());
        return this.brewingUnit.brew(CoffeeSelection.FILTER_COFFEE, groundCoffee, config.getQuantityWater());
    }

    private CoffeeDrink brewEspresso() {
        Configuration config = configMap.get(CoffeeSelection.ESPRESSO);
        GroundCoffee groundCoffee = this.grinder.grind(this.beans.get(CoffeeSelection.ESPRESSO), config.getQuantityCoffee());
        return this.brewingUnit.brew(CoffeeSelection.ESPRESSO, groundCoffee, config.getQuantityWater());
    }

    @Override
    public void addCoffee(CoffeeSelection selection, Object coffee) throws CoffeeException {
        if (!(coffee instanceof CoffeeBean)) {
            throw new CoffeeException("Invalid coffee type for PremiumCoffeeMachine.");
        }

        CoffeeBean newBeans = (CoffeeBean) coffee;
        CoffeeBean existingBeans = this.beans.get(selection);

        if (existingBeans != null) {
            if (existingBeans.getName().equals(newBeans.getName())) {
                existingBeans.setQuantity(existingBeans.getQuantity() + newBeans.getQuantity());
            } else {
                throw new CoffeeException("Only one kind of coffee supported for each CoffeeSelection.");
            }
        } else {
            this.beans.put(selection, newBeans);
        }
    }
}

// Main Class
public class Main {
    public static void main(String[] args) throws CoffeeException {
        Map<CoffeeSelection, GroundCoffee> basicCoffee = new HashMap<>();
        basicCoffee.put(CoffeeSelection.FILTER_COFFEE, new GroundCoffee("Arabica", 500));

        CoffeeMachine basicMachine = new BasicCoffeeMachine(basicCoffee);
        System.out.println(basicMachine.brewCoffee(CoffeeSelection.FILTER_COFFEE));

        Map<CoffeeSelection, CoffeeBean> premiumCoffee = new HashMap<>();
        premiumCoffee.put(CoffeeSelection.FILTER_COFFEE, new CoffeeBean("Arabica", 500));
        premiumCoffee.put(CoffeeSelection.ESPRESSO, new CoffeeBean("Robusta", 300));

        CoffeeMachine premiumMachine = new PremiumCoffeeMachine(premiumCoffee);
        System.out.println(premiumMachine.brewCoffee(CoffeeSelection.ESPRESSO));
    }
}
